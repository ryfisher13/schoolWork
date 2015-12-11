#include <stdio.h>
#include <stdlib.h>
#include <math.h>

float gravity = -9.8; // meters/second^2
float wind = 0.0;

float degreesToradians(float degrees)
{
  return ((degrees / 180.0) * 3.14159);
}



int main (int argc, char **argv)
{
  if (argc != 4) {
    printf("usage: %s height velocity angle\n", argv[0]);
    return 0;
  }


  float x = 0, y = 0; // -- current location of projectile, Closed form
  float yprev = atof(argv[1]); // -- previous location of the projectile
  float dy; // -- for computing the derivative
  float xe = 0.0, ye = atof(argv[1]); // -- current location of projectile, Euler form
  float vx = atof(argv[2]) * cos(degreesToradians(atof(argv[3])));
  float vy = atof(argv[2]) * sin(degreesToradians(atof(argv[3])));
  float dt = 0.1;
  float t = dt;
  
  do {
    // -- get the new position of the projectile
    ClosedForm(t, atof(argv[2]), atof(argv[3]), atof(argv[1]),
	     &x, &y);

    EulerForm(dt, &vx, &vy, &xe, &ye);

    printf("%f, %f, %f, %f, %f\n", t, x, y, xe, ye);
    t = t + dt;

    dy = y - yprev; // -- compute the y derivative
    yprev = y; // - save current position as previous position
    
  } while ((y >= 0) || (dy >= 0));

  
  return 0;
}

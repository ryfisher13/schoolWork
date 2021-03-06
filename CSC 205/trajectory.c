#include <stdio.h>
#include <stdlib.h>
#include <math.h>

float gravity = -9.8; // meters/second^2
float wind = 0.0;

float degreesToradians(float degrees)
{
  return ((degrees / 180.0) * 3.14159);
}


void EulerForm (float dt, float *vx, float *vy, float *x, float *y)
{
  *x = *x + (*vx * dt);
  *y = *y + (*vy * dt) + (0.5 * gravity * dt * dt);
  *vx = *vx + (wind * dt);
  *vy = *vy + (gravity * dt);
}

float results(float *x, float *y, float tx, float ty, float closest)
{
  float s, check;
  check = sqrt((*x-tx)*(*x-tx)+(*y-ty)*(*y-ty));
  if(closest > check){
   s = check;
  }
  else{
s = closest;
}
  return s;
}


void ClosedForm (float time, float velocity, float theta, float height,
		 float *x, float *y)
{
  float radians = degreesToradians(theta);

  *x = velocity * time * cos(radians);
  *y = height +
    (velocity * time * sin(radians)) +
    (0.5 * gravity * time * time);
}


int main (int argc, char **argv)
{
  if (argc != 2) {
    printf("usage: %s <level>\n", argv[0]);
    return 0;
  }
  int lvl = atoi(argv[1])*1000;
  int wins = 0;
  int k = 0;
  srand(atoi(argv[1]));
  float tx = rand() % lvl;
  float ty = rand() % lvl;
  float v;
  while(k<3){
    int pos = 10;
    float x = 0, y = 0; // -- current location of projectile, Closed form
    float yprev; // -- previous location of the projectile
    float dy; // -- for computing the derivative
    float xe = 0.0, ye; // -- current location of projectile, Euler form
    float vx;
    float vy;
    float dt = 0.1;
    float t = dt;
    float a;
    float u;
    float cprev;
    float c = RAND_MAX;
    float h;
    printf("hight:");
    scanf("%f",&h);
    printf("velocity:");
    scanf("%f", &u);
    printf("angle:");
    scanf("%f",&a);
    ye = h;
    yprev = ye;
    vx = u * cos(degreesToradians(a));
    vy = u * sin(degreesToradians(a));
    
    do{
      ClosedForm(t, u, a, h, &x, &y);
      // -- get the new position of the projectile
      EulerForm(dt, &vx, &vy, &xe, &ye);
      //printf("%f\t%f\t%f\t%f\t",tx,ty,x,y);    
      c = results(&x, &y, tx, ty, c);
      //printf("%f\n",c);
      t = t + dt;
      
      dy = y - yprev; // -- compute the y derivative
      yprev = y; // - save current position as previous position
      if(cprev == c){
	if(pos == 10){
	  if(ye < ty){
	    pos = 0;
	  }
	  else {
	    pos = 1;
	  }
	}
      }
      cprev = c;
    } while ((y >= 0) || (dy >= 0));
    printf("you got within %f meters from the center of the target\n",c);
    if(c < 10 && c > -10){
    printf("you win\n");
    k = 0;
    lvl = lvl + 1000;
    tx = rand()%lvl;
    //ty = rand()%lvl;
    ++wins;
    }
    if(c >= 10){
      if(pos == 1){
	printf("your shot was above the target at its closest point\n");
      }
      else{
	printf("your shot was below the target at its closest position\n");
      }
      ++k;
    }
    
  }
  printf("you lost\nyou hit %d targets\n",wins);
  return 0;
}

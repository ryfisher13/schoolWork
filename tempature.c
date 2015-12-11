#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc,  char **argv)
{
  printf("%f C is %f F\n",atof(argv[1]), 9.0/5.0*atof(argv[1])+32);
  return 0;
}

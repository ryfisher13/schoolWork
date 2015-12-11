#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc,char **argv)
{
  if(argc!=3){
    printf("Usage: %s <seed> <# of samples>\n",argv[0]);
    return 0;
  }
  int seed=atoi(argv[1]);
  int samples=atoi(argv[2]);
  int count0=0;
  int count1=0;
  float number0;
  float number1;
  float sum0=0;
  float sum1=0;
  float StandardDeviation;
  float Mean;
  srand(seed);
  while(samples>count0){
    count0=count0+1;
    number0=rand()/2147483647.0;
    sum0=number0+sum0;
  }
  Mean=sum0/samples;
  printf("mean: %f\n",Mean);
  srand(seed);
  while(samples>count1){
    count1=count1+1;
    number1=rand()/2147483647.0;
    sum1=(number1-Mean)*(number1-Mean)+sum1;
  }
  StandardDeviation=sqrt(sum1/samples);
  printf("Standard Deviation:%f\n",StandardDeviation);
  printf("%d\n",RAND_MAX);
  return 0;
}

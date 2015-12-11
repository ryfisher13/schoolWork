#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc,char **argv)
{
  if(argc!=3){
    printf("Usage: %s <seed> <# of samples>",argv[0]);
    return 0;
  }
  int seed=atoi(argv[1]);
  int samples=atoi(argv[2]);
  int count0;
  int count1;
  float number0;
  float number1;
  float sum0==0;
  float sum1==0;
  float StandardDeviation;
  srand(seed);
  while(samples>count0){
    count0=count0+1;
    number0=rand()/32767;
    sum0=number0+sum0;
  }
  float Mean=sum/samples;
  float StandardDeviation;
  srand(seed);
  while(samples>count0){
    count1=count1+1;
    number1=rand()/32767;
    sum1=(number1-Mean)*(number1-mean);
  }
  sqrt(StandardDeviation);
  printf("mean: %f",Mean);
  printf("Standard Deviation:%f\n",StandardDeviation);
  return 0;
}

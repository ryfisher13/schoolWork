#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc,char **argv)
{
  if(argc!=5){
    printf("Usage: %s <Seed> <# of Values> <Min> <Max>\n",argv[0]);
    return 0;
  }
  float Std;
  float Std2;
  float Sum1;
  float Sum2;
  int i;
  int Values=atoi(argv[2]);
  int Seed=atoi(argv[1]);
  float y;
  float Max=atof(argv[4]);
  float Min=atof(argv[3]);
  float Mean;
  float Mean2;
  float Delta;
  for(i=0,srand(Seed),Sum1=0,Sum2=0;i<Values+1;++i){
    y=(Max-Min)/(RAND_MAX)*rand()+Min;
    Sum1=Sum1+y*y;
    Sum2=Sum2+y;
  }
  Std=sqrt(fabs(((float)1/Values*Sum1)-(((float)1/Values*Sum2*((float)1/Values*Sum2)))));
  printf("Standard Method = %f\n",Std);
  //end of the the standard method, begining of the Welford Method
  for(i=1,Mean=0,Mean2=0,srand(Seed);i<Values+1;++i){
    y=(Max-Min)/(RAND_MAX)*rand()+Min;
    Delta=y-Mean;
    Mean=Mean+(Delta/(float)i);
    Mean2=Mean2+Delta*(y-Mean);
  }
  Std2=sqrt(fabs(Mean2/(i-1)));
  printf("Welford's Method = %f\n",Std2);
  return 0;
}

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc,char **argv)
{
  if(argc!=4){
    printf("Usage: %s A B C\n",argv[0]);
    return 0;
  }
  float A=atof(argv[1]);
  float B=atof(argv[2]);
  float C=atof(argv[3]);
  float PosSolution=(-1*B+sqrt(fabs((B*B)-(4*A*C))))/(2*A);
  float NegSolution=(-1*B-sqrt(fabs((B*B)-(4*A*C))))/(2*A);
    if(fabs(A)<0.00001){
    if(fabs(B)<0.0001){
      printf("no or infinately many solution\n");
    }
    else{
      printf("linear equation:\n%f\n",-C/B);
    }
    return 0;
  }
    if(((B*B)-(4*A*C))<0.0){
    printf("2 complex solutions:\n");
    printf("%f + %fi\n",-1*B/(2*A),sqrt(fabs((B*B)-(4*A*C)))/(2*A));
    printf("%f - %fi\n",-1*B/(2*A),sqrt(fabs((B*B)-(4*A*C)))/(2*A));
    return 0;
  }
    if(fabs((B*B)-(4*A*C))<0.0001){
      printf("1 real solutions:\n%f\n",PosSolution);
    }
    else{
      printf("2 real solutions:\n%f\n%f\n",PosSolution,NegSolution);
    }
    return 0;
}
		     

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc,char **argv)
{
  if(argc!=2){
    printf("Usage: %s <upper limmit>\n",argv[0]);
    return 0;
  }
  int i,A,B;
  int count=atoi(argv[1]);
  float E1,E2,E3,E4,E5,E6,E7,E8,C1,C2,C3,C4,C5,C6,C7,C8,number;
  for(i=1,E1=0,E2=0,E3=0,E4=0,E5=0,E6=0,E7=0,E8=0,C1=0,C2=0,C3=0,C4=0,C5=0,C6=0,C7=0,C8=0;i<=count;i++){
    E1=i;
    E2=E2+i;
    E3=E3+(i*i);
    E5=i*pow(2,i)+E5;
    E6=2+7+E6;
    E7=(1.0/(float)i)+E7;
    E8=log10(i)+E8;
    A=A+2;
    B=B+7;
  }
  for(i=0;i<=count;i++){
    E4=pow(3,i)+E4;
  }
  for(i=count,number=1;i>0;i--){
    number=i*number;
  }
  C1=count;
  C2=(count*(count+1))/2;
  C3=(2*pow(count,3)+3*pow(count,2)+count)/6;
  C4=(pow(3,count+1)-1)/(3-1);
  C5=(count-1)*pow(2,count+1)+2;
  C6=A+B;
  C7=log(count)+0.57721566;
  C8=log10(number);
  printf(" Equation 1:%f %f\n Equation 2:%f %f\n Equation 3:%f %f\n Equation 4:%f %f\n Equation 5:%f %f\n Equation 6:%f %f\n Equation 7:%f %f\n Equation 8:%f %f\n",E1,C1,E2,C2,E3,C3,E4,C4,E5,C5,E6,C6,E7,C7,E8,C8);
  return 0;
}

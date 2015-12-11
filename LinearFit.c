#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc,char **argv)
{
  //correct number of imputs
  if(argc!=2){
    printf("Usage: %s <Data File>\n",argv[0]);
    return 0;
  }
  //open file and make sure it opens properly
  FILE *Data;
  Data = fopen(argv[1],"r");
  if(Data == 0){
    printf("cannot open file %s\n",argv[1]);
    return 0;
  }
  //number of doubles
  int n;
  fscanf(Data,"%d",&n);
  printf("there are %d doubles in the file\n",n);
  //declare array
  float *X, *Y;
  X=(float *)malloc(n * sizeof(float));
  Y=(float *)malloc(n * sizeof(float));
  //read
  int i;
  for(i=0;i<n;++i){
    fscanf(Data,"%f %f",&X[i], &Y[i]);
  }
  //close file
  fclose(Data);
  //doing the math
  float Math1=0, Math2=0, Math3=0, Math4=0, Math5=0, Alfa, Beta, Ymean=0, Xmean=0,Ymeanr,Xmeanr;
  for(i=0;i<n;++i,++X,++Y){
  Math1=*X**Y+Math1;
  Math2=*X+Math2;
  Math3=*Y+Math3;
  Math4=*X**X+Math4;
  Ymean=*Y+Ymean;
  Xmean=*X+Xmean;
  }
  Ymeanr=Ymean/n;
  Xmeanr=Xmean/n;
  Beta=(Math1-(Math2/n)*Math3)/(Math4-(Math2*Math2)/n);
  Alfa=Ymeanr-(Beta*Xmeanr);
  printf("y=%fx+(%f)\n",Beta,Alfa);
  return 0;
}

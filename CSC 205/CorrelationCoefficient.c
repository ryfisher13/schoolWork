#include <stdio.h>
#include <stdlib.h>
#include <math.h>

float *ReadData(FILE *file, int n){
  int i;
  float *a;
  a = (float *)malloc(n * sizeof(float));
  for(i=0;i<n;++i){
  fscanf(file,"%f",&a[i]);
  }
  return a;
}
float PCor(float *x, float *y, int n){
  int i;
  float value1,value2,mean1,mean2,s1,s2,s3,r;  
  for(i=0,value1=0,value2=0;i<n;++i){
    value1=value1+x[i];
    value2=value2+y[i];
  }
  mean1=value1/n;
  mean2=value2/n;
  for(i=0,value1=0;i<n;++i,++x,++y){
    s1=(*x-mean1)*(*y-mean2)+s1;
    s2=(*x-mean1)*(*x-mean1)+s2;
    s3=(*y-mean2)*(*y-mean2)+s3;
  }
  r=s1/(sqrt(s2*s3));
  return r;
}

int main(int argc,char **argv)
{
  if(argc!=3){
    printf("Usage: %s <Imput File 1> <Imput File 2>\n",argv[0]);
    return 0;
  }
  //open files,check if they exist and have the same number of numbers
  FILE *XFile;
  FILE *YFile;
  XFile = fopen(argv[1],"r");
  YFile = fopen(argv[2],"r");
  if(XFile == 0){
    printf("%s does not open.\n",argv[1]);
    return 0;
  }
  if(YFile == 0){
    printf("%s does not open.\n",argv[2]);
    return 0;
  }
  int X;
  int Y;
  fscanf(XFile,"%d",&X);
  fscanf(YFile,"%d",&Y);
  if(X!=Y){
    printf("The files do not have the same number of imputs\n");
    return 0;
  }
  //Reading the files
  float *AX,*AY;
  AX = ReadData(XFile,X);
  AY = ReadData(YFile,Y);
  fclose(YFile);
  fclose(XFile);
  //Correlate and Print
  printf("Pearson Correlation Coefficient: %f\n", PCor(AX, AY, X));
  //Release the Heap
  free (AX);
  free (AY);
  return 0;
}

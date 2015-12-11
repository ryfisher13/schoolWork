#include <stdio.h>
#include <stdlib.h>
#include <math.h>

#include "BMPWriter.h"

int main(int argc,char **argv)
{
  if(argc != 4){
    printf("Usage: %s <filename> <High> <with>\n",argv[0]);
    return 0;
  }
  int **red;
  red = makeMatrix(atoi(argv[2]),atoi(argv[3]));
  int i,j;
  int h = atoi(argv[2]);
  int w = atoi(argv[3]);
  float SR,SI;
  SR = 5.0/(h-1);
  SI = 3.5/(w-1);
  for(i = 0; i < h; ++i){
    float CR = SR*i-2.5;
    for(j = 0; j < w; ++j){
      float CI = SI*j-1.7;
      float ZR = 0.0;
      float ZI = 0.0;
      float temp;
      int count =0;
      while(count<255 && ((ZR*ZR)+(ZI*ZI))<4.0){
	temp = (ZR*ZR)-(ZI*ZI)+CR;
	ZI = 2.0*ZR*ZI+CI;
	ZR = temp;
	count++;
      }
      red[i][j]=count;
    }
  } 
  WriteBMP(argv[1], 0, red, 0, h, w);
  for(i = 0; i<h; ++i){
    free(red[i]);
  }
  return 0;
}

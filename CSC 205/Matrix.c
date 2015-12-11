#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc,char **argv)
{
  if(argc!=2){
    printf("Usage: %s\n",argv[0]);
    return 0;
  }
  int i,j;
  for(i=0;i<3;++i){
    for(j=0;j<3;++j){
      printf("\t%d",i*3+j+1);

    }
    printf("\n");
  }
  return 0;
}

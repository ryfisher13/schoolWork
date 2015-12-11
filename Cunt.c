#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc,char **argv)
{
  if(argc!=1){
    printf("Usage: %s\n",argv[0]);
    return 0;
  }
  while(1){
    int definer=rand()%2;
    if(definer==1){
      printf("Fuck You\n");
    }
    if(definer==0){
      printf("you're a cunt\n");
  }
  }
}

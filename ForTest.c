#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc,char **argv)
{
  if(argc!=2){
    printf("Usage: %s <number of odd numbers>\n",argv[0]);
    return 0;
  }
  int i;
  int n=atoi(argv[1]);
  int odd;
  int answer=0;
  if(n>0){
    for(i=0,odd=-1;i<n;++i){
      odd=2+odd;
      answer=odd+answer;
    }
  printf("sum = %d\n",answer);
  }else{
    printf("cannot add 0 or negitive odd numbers together\n");
  }
  return 0;
}

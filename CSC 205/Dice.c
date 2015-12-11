#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc,char **argv)
{
  if(argc!=2){
    printf("Usage: %s <int>\n",argv[0]);
    return 0;
  }
  (srand(atoi(argv[1])));
  int x;
  int y;
  while(x!=6){
    x=(rand()%6)+1;
  y=y+1;
  }
  printf("%d rolls\n",y);
  return 0;
}

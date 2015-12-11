#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc,char **argv)
{
  if(argc != 4){
    printf("Usage: %s <#> <Math statement> <#>\n",argv[0]);
    return 0;
  }

  int x=atoi(argv[1]);
  int y=atoi(argv[3]);
  char operator=argv[2][0];
  switch(operator){
  case '+':
    printf("%d\n",x+y);
    break;
  case '-':
    printf("%d\n",x-y);
    break;
  case'*':
    printf("%d\n",x*y);
    break;
  case '/':
    printf("%d\n",x/y);
    break;
  case'%':
    printf("%d\n",x%y);
  break;
  default:

  break;
  }

  return 0;
}

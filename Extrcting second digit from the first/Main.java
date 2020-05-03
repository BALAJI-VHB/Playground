#include <stdio.h>
int main() 
{
	int num;
  scanf("%d", &num);
  int n = 0,n1 = 0;
  while(num / 10 !=0)
  {
    n = num / 10;
    n1 = num % 10;
    num = n;
  }
  printf("%d",n1);
	return 0;
}
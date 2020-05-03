#include <stdio.h>
int main() 
{
	int num;
  scanf("%d", &num);
  int n = num%10,n1 = 0;
  while(num / 10 != 0)
  {
    n1 = num / 10;
    num = num / 10;
  }
 printf("%d",n+n1);
	return 0;
}
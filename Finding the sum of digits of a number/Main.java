#include <stdio.h>
int main() 
{
	//Type your code
  int num;
  scanf("%d", &num );
  int n=0,n1=0;
  while(num % 10 != 0 || num/10 != 0)
  {
    n=num%10;
    n1 = n1+n;
    num = num/10;
  }
  printf("%d",n1);
	return 0;
}

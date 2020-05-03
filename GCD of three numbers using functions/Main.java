#include <stdio.h>
int main() {
 int num1,num2,num3;
  scanf("%d%d%d",&num1,&num2,&num3);
  int min1 = (num1 > num2)? num2 : num1 ;
  int fgcd = gcd(min1,num1,num2);
  int min2 = (fgcd > num3)? num3 : fgcd;
  int finGcd = gcd(min2,num3,fgcd);
  printf("%d",finGcd);

	return 0;
}
int gcd(min,n1,n2)
{
  while(n1 % min != 0&& n2 % min != 0)
{
  min--;
}
return min;
}
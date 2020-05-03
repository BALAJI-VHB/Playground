#include <stdio.h>
int main() {
	//Type your code
  int num, count = 0;
  scanf("%d",&num);
  int n = num, n1 = num,digit = 0,sum = 0 ;
  while( n > 0 )
  {
    count = count + 1;
    n = n / 10;
  }
  while(n1 > 0)
  {
    digit = n1 % 10;
    int sum1 = 1;
    //printf("digit %d\n",digit);
    for( int i=0; i< count; i++)
      sum1 = sum1 * digit;
    sum = sum + sum1;
   // printf("%d\n",sum1);
    n1 = n1 / 10;
  }
  if ( sum == num)
    printf("Armstrong Number");
  else 
    printf("Not an Armstrong Number");
	return 0;
}
#include<stdio.h>
int main() {
   int num;
  scanf("%d", &num);
  int sum = sumN_nat(num);
  printf("%d",sum);
  	return 0;
}

int sumN_nat (num)
{
  int sum = 0;
  for(int i = 1; i <= num; i++)
  {
    sum += i; 
  }
  return sum;
}
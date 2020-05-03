#include<stdio.h>
int main() {
   int num;
  scanf("%d",&num);
  int result = sqr (num);
  printf("%d",result);
   return 0;
}
int sqr (x)
{
 int sq = x*x;
  return sq;
}
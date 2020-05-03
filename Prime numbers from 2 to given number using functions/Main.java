#include<stdio.h>
int main()
{
  int num1;
  scanf("%d",&num1);
  for(int i = 2; i <= num1;i++)
  {
    if(i == fn(i))
       printf("%d\n",fn(i));
  }
   
}
int fn(int a)
{ 
  int count = 0;
  for(int i = 1; i <= a ;i++)
  {
    if(a % i == 0 )
      count++;
  }
  if(count == 2)
  { return a;}
}
#include<stdio.h>
int main()
{
   int arr_size ;
  scanf("%d",&arr_size);
  int arr[arr_size];
  for(int i = 0; i < arr_size;i++)
  {
  scanf("%d",&arr[i]);
  }
  int large = 0;
  for(int i = 0; i < arr_size;i++)
  {
   if(large < arr[i])
   { large = arr[i];}
  }
  printf("%d",large);
  return 0;
}
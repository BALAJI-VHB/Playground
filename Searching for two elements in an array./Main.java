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
  int sea_el_1;
  scanf("%d",&sea_el_1);
  int sea_el_2,index = 0,index1 = 0;
  scanf("%d",&sea_el_2);
  for(int i = 0;i < arr_size; i++)
  {
   if(sea_el_1 == arr[i])
   {
     index = i;
     break;
   }
  }
  for(int i = 0;i < arr_size; i++)
  {
   if(sea_el_2 == arr[i])
   {
     index1 = i;
     break;
   }
  }
  if(index != 0)
    printf("%d\n",index);
  else
    printf("-1");
   if(index1 != 0)
    printf("%d",index1);
  else
    printf("-1");
  return 0;
}
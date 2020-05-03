// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int arr_size;
  scanf("%d",&arr_size);
  int arr[arr_size];
  for(int i = 0; i < arr_size;i++)
  {
    scanf("%d",&arr[i]);
  }
  int max = 0,idx = 0;
   for(int i = 0; i < arr_size;i++)
  {
    if(arr[i] > max)
    {
      max = arr[i];
      idx = i;
    }
  }
  printf("%d",idx);
   return 0;
}
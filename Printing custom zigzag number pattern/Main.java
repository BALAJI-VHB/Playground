#include <stdio.h>
int main() {
	// Type your code here
  int num;
  scanf("%d", &num);
  for(int i = 1; i <= num ;i++)
  {
    for(int j = 1;j <= num;j++)
    {
      if(i % 2 != 0)
      {
        if(j != num)
          printf("%d", i);
        else
          printf("%d", i+1);
      }
      else
      {
        if(j != 1)
          printf("%d", i);
        else
          printf("%d", i+1);
      }
    }printf("\n");
  }
	return 0;
  
}
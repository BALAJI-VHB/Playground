#include <stdio.h>
int main(){
  	// Type your code here
  int num;
  scanf("%d", &num);
  for(int i = 1; i <= num;i++)
  {
    for (int j = 1;j <= i;j++)
    {
      printf("%d", i);
    }
    printf("\n");
  }
	return 0;
}
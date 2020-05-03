#include <stdio.h>
int main() {
	// Type your code here
  int num,sum = 0;
  scanf("%d", &num);
  for ( int i = 1; i <= num;i++)
  {
    for(int space = num-1 ; space >= i; space--)
      printf(" ");
    for ( int j = 0; j < i; j++)
    {
      printf("%d ", sum = sum + 1);
    }
    printf("\n");
  }   
    
  return 0;
}
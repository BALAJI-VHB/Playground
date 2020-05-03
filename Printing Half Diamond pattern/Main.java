#include <stdio.h>
int main() {
	// Type your code here
  int num;
  scanf("%d", &num);
  for (int i = 1; i <= num;i++)
  {
  for (int space = 1;space <= num-i; space++)
    printf(" ");
  for(int j = 1; j <= (i*2)-1; j++)
    printf("*");
  printf("\n");}
    
  
	return 0;
  }
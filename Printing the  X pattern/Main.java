#include <stdio.h>
int main() {
	// Type your code here
  int num;
  scanf("%d",&num);
  for(int i = 1; i <= num; i++)
  {
    for(int j = 1;j <= num; j++)
    {
      if(i == j || j == (num+1)-i)
        printf("*");
      else
        printf(" ");
    }
    printf("\n");
  }
	return 0;
}
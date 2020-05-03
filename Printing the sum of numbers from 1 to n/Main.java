#include <stdio.h>
int main() {
	//Type your code
  int num,sum = 0;
 scanf("%d", &num);
  for(int i = 0 ; i <= num ; i++ )
     sum = sum + i;
  printf("%d",sum);
	return 0;
}
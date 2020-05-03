#include <stdio.h>
int main() {
	//Type your code
  int num, digit = 0 ;
  scanf("%d", &num );
  int n = num, sum = 0;
  while( n > 0 )
  {
    digit = n % 10;
    int fact_no = 1;
    for (int i = 1; i <= digit; i++)
      fact_no = fact_no * i;
    //printf("%d\n",fact_no);
    sum = sum + fact_no;
    n = n / 10;
  }
 // printf("%d", sum);
  if (sum == num)
    printf("Yes");
  else
    printf("No");
	return 0;
}
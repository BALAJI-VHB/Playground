#include <stdio.h>
int main() {
	//Type your code
  int num,fact_no = 1;
  scanf("%d", &num );
  for( int i = 1; i <= num ; i++ ) 
    fact_no = fact_no * i;
  printf("%d",fact_no);
	return 0;
}
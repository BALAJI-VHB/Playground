#include <stdio.h>
int main(){
	int num1,num2,num3;
  scanf("%d%d%d",&num1,&num2,&num3);
  int fgn = first(num1,num2);
  int fingn = first(fgn,num3);
  printf("%d",fingn);
  	return 0;
}
int first(int a, int b)
{
  int gn = (a > b)? a : b;
  return gn;
}
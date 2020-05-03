#include<stdio.h>
#include<math.h>
int main(){
    int base,exponent,ans;
  scanf("%d%d",&base,&exponent);
  ans = pow(base,exponent);
  printf("%d",ans);
  	return 0;
}
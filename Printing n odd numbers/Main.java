#include <stdio.h>
int main() {
	//Type your code
  int num,count = 0;
  scanf("%d", &num );
	for(int i = 1; i <= 2*num;i++ )
    {
      if( i % 2 != 0 )
      {
        printf("%d\n",i);
        count = count +1;
      }
      if(count==num)
        break;
    }
  return 0; 
}
#include<stdio.h>
int main(){
    int num;
    scanf("%d", &num);
    int n1 = 0;
    for(int curr_row = 1; curr_row <= num; curr_row++){
        for(int curr_col = 1; curr_col <= curr_row; curr_col++){
            if(n1 == 0)
            {
                printf("*");
                n1 = 1;
            }
            else{
                printf("#");
                n1 = 0;
            }
        }
        printf("\n");
    }
}
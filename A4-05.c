#include<stdio.h>
int main()
{
    int array[15],i,count=0;
    printf("Please Enter 15 numbers: ");
    for(i=0;i<15;i++){
        scanf("%d",&array[i]);
    }
    for(i=0;i<15;i++){
        if(array[i]>=0 && array[i]<=9){
            count++;
        }
    }
    printf("Times: %d",count);
    return 0;
}

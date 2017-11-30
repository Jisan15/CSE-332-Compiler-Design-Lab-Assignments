#include<stdio.h>
int main()
{
    int array[10], i;
    printf("Please Enter 10 numbers: ");
    for(i=0;i<10;i++){
        scanf("%d",&array[i]);
    }
    for(i=0;i<10;i++){
        printf("%d\n",array[i]);
    }
    return 0;
}

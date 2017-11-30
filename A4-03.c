#include<stdio.h>
int main()
{
    int array[20],i;
    for (i=0; i < 20; i++) {
        scanf("%d",&array[i]);
    }
    printf("\n");
    for(i=20; i > 0; i--){
        if(array[i]%2 == 0){
            printf("%d\n", array[i]);
        }
    }
    return 0;

}

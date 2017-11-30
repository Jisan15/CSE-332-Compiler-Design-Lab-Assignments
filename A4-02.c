#include<stdio.h>
int main()
{
    int array[11], i;
    for(i=1; i<=10; i++){
        scanf("%d", &array[i]);
    }
    printf("\n");
    for (i=10; i>=1; i--){
        printf("%d\n", array[i]);
    }
    return 0;
}

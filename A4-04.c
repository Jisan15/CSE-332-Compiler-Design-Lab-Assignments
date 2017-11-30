#include<stdio.h>
int main()
{
    int array[10], i, number, flag=0;
    printf("Please Enter ten numbers:\n");
    for (i=0; i<10; i++){
        scanf ("%d",&array[i]);
    }
    printf("Enter your query number: ");
    scanf("%d", &number);
    for (i=0; i<10; i++){
        if (number == array[i]){
            flag++;
        }
    }
    if (flag == 1){
        printf("yes\n");
    }
    else{
        printf ("no\n");
    }
    return 0;
}

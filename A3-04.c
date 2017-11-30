#include <stdio.h>
int main()
{
    int array[5], i, count = 0;
    for(i = 1; i <= 5; i++)
    {
        scanf("%d", &array[i]);
    }
    printf("\n");
    for(i = 1; i <= 5; i++)
    {
        if(array[i] <= 10)
        {
            count++;
        }
    }
    printf("%d", count);

    return 0;
}


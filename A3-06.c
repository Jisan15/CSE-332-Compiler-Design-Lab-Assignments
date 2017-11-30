#include <stdio.h>
int main()
{
    int array[5], i, query, match = 0;
    for(i = 0; i < 5; i++)
    {
        scanf("%d", &array[i]);
    }
    scanf("\n%d", &query);
    printf("\n");
    for(i = 0; i < 5; i++)
    {
        if(array[i] == query)
        {
            printf("%d was found at location %d", query, (i + 1));
            match = 1;
            break;
        }
    }

    if (match == 0)

        printf("%d was not found", query);

    return 0;
}




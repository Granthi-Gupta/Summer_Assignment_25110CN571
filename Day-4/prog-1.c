#include <stdio.h>
int main()
{
    int a=0, b=1;
    int n;
    printf("enter the number of tems of fibonacci= ");
    scanf("%d", &n);
    printf("0, 1, ");
    for(int i=3; i<=n; i++)
    {
        int c= a+b;
        printf("%d, ", c);
        a=b;
        b=c;
    }
    return 0;
    
}
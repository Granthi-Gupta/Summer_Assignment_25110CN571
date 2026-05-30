#include<stdio.h>
int main()
{
    int n;
    printf("enter the value till which sum is needed= ");
    scanf("%d", &n);
    int sum=0;
    for(int i=1; i<=n; i++ )
    {
        sum+=i;
    }
    printf("the sum= %d", sum);
    return 0;
}
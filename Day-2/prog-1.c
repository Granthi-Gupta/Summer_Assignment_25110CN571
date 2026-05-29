#include<stdio.h>
int main()
{
    int n, d, sum=0;
    printf("enter a number= ");
    scanf("%d", &n);
    while(n!=0)
    {
        d= n%10;
        n/=10;
        sum= sum+d;
    }
    printf("the sum of digits= %d", sum);
    return 0;
}
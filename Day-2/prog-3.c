#include<stdio.h>
int main()
{
    int n, p=1, d;
    printf("enter a number= ");
    scanf("%d", &n);
    while(n!=0)
    {
        d= n%10;
        p*=d;
        n/=10;
    }
    printf("the product of digits= %d", p);
    return 0;
}
#include<stdio.h>
int main()
{
    int n,d, rev=0;
    printf("enter a number= ");
    scanf("%d", &n);
    while(n!=0)
    {
        d= n%10;
        rev= rev*10+d;
        n/=10;
    }
    printf("the reverse= %d", rev);
    return 0;
}
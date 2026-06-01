#include <stdio.h>
#include <math.h>
int digit(int a)
{
    int d=0;
    while(a!=0)
    {
        d++;
        a/=10;
    }
    return d;
}
int main()
{
    int n;
    printf("enter a number= ");
    scanf("%d", &n);
    int d= digit(n);
    int num=n; int sum=0;
    while(n!=0)
    {
        int digi= n%10;
        sum+=pow(digi, d);
        n/=10;
    }
    if(sum==num)
    {
        printf("the number is armstrong");
    }
    else{
        printf("number is not armstrong");
    }
    return 0;
}
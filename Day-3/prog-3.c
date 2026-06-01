#include<stdio.h>
int gcd(int n, int m)
{
    if(m==0)
    {
        return n;
    }
    else{
        return gcd(m, n%m);
    }
}
int main()
{
    int a,b;
    printf("enter two numbers= ");
    scanf("%d%d", &a, &b);
    int g= gcd(a,b);
    printf("the gcd of %d and %d= %d", a,b,g);
    return 0;
}
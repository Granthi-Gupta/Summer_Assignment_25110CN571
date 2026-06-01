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
    int l= (a*b)/g;
    printf("the LCM of %d and %d= %d", a,b,l);
    return 0;

}
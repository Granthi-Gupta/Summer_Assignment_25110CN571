#include<stdio.h>
int main()
{
    int a=0, b=1, n, c;
    printf("enter the value of n= ");
    scanf("%d", &n);
    if(n>1)
    {
    c=a+b;
    for(int i=3; i<=n;i++)
    {
        c=a+b;
        a=b;
        b=c;
    }
    printf("%dth term of fibonacci series is= %d", n,c);
}
else{
    printf("%dst term of fibonacci series is= 0", n);
}
    return 0;
}
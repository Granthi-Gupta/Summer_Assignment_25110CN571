#include<stdio.h>
int main()
{
    int n;
    printf("enter a number= ");
    scanf("%d", &n);
    int d=0;
    while(n!=0)
    {
        d++;
        n=n/10;
    }
    printf("the number of digits= %d", d);
    return 0;
}
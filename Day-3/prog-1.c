#include<stdio.h>
int main()
{
    int n;
    printf("enter a number= ");
    scanf("%d", &n);
    int f=0;
    for(int i=1; i<=n/2; i++)
    {
        if(n%i==0)
        {
            f++;
        }
    }
    if(f==1)
    {
        printf("the number is prime.");
    }
    else{
        printf("the number is not prime.");
    }
    return 0;
}
#include<stdio.h>
int main()
{
    int a,b;
    printf("enter a range= ");
    scanf("%d %d", &a, &b);
    printf("the prime numbers in the range %d and %d are: \n", a,b);
    for(int i=a; i<=b; i++)
    {
        int n=i;
        int f=0;
        for(int j=2; j<=n/2; j++)
        {
            if(n%j==0)
            {
                f++;
            }
        }
        if(f==0)
        {
            printf("%d \n", n);
        }
    }
    return 0;
}
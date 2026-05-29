#include<stdio.h>
int main()
{
    int n, rev=0, d;
    printf("enter a number= ");
    scanf("%d", &n);
    int num=n;
    while(n!=0)
    {
        d=n%10;
        rev= rev*10+d;
        n/=10;
    }
    if(rev==num)
    {
        printf("number is palindrome");

    }
    else{
        printf("number is not palindrome");
    }
    return 0;
}
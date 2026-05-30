#include<stdio.h>
int main()
{
    printf("enter a number= ");
    int n;
    scanf("%d", &n);
    int pro;
    for(int i=1; i<=10; i++)
    {
        pro= n*i;
        printf("%d * %d = %d \n", n,i, pro);
    }
    return 0;
}
#include<stdio.h>
int main()
{
    int num;
    printf("enter a number= ");
    scanf("%d", &num);
    int d=0;
    while(num>0)
    {
        num= num/10;
        d++;
    }
    printf("the number of digits= %d", d);
    return 0;
}
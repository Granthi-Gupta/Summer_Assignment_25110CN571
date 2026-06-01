#include<stdio.h>
#include<math.h>
int armstrong(int n)
{
    int num=n, d=0;
    while(n!=0)
    {
      n/=10;
      d++;
    }
    int n1=num;
    int dig, sum=0;
    while(n1!=0)
    {
      dig= n1%10;
      sum+= pow(dig, d);
      n1/=10;
    }
    if(num==sum)
    {
        return 1;
    }
    else return 0;
}
int main()
{
    int a,b;
    printf("enter the range= ");
    scanf("%d%d", &a, &b);
    for(int i=a; i<=b; i++)
    {
        int f= armstrong(i);
        if(f==1)
        {
            printf("%d ", i);
        }
    }
    return 0;

}
import java.util.Scanner;
public class Prog2 {
     static int fact(int n)
    {
        int f=1;
        for(int i=1; i<=n; i++)
        {
            f*=i;
        }
        return f;
    }
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter a number=");
        int n= in.nextInt();
        int num=n, sum=0;
        while(n!=0)
        {
            int d= n%10;
            sum+= fact(d);
            n/=10;
        }
        if(sum==num)
            System.out.println("the number is strong.");
        else
            System.out.println("number is not strong.");
        in.close();


    }
}

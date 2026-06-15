import java.util.Scanner;
public class Fib {
    static void Fibonacci(int s)
    {
        int a=0, b=1,c;
        if(s==1)
            System.out.println("0");
        else if(s==2)
            System.out.println("0,1");
        else 
        {
            System.out.print("0, 1,");
            for(int i=3;i<=s;i++)
            {
                c=a+b;
                System.out.print(" "+c+",");
                a=b;
                b=c;
            }
        }
            
    }
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of fibonacci series");
        int l= in.nextInt();
        Fibonacci(l);
        in.close();
    }
}

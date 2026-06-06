import java.util.Scanner;
public class SumF
{
    static int  sum(int a, int b)
    {
        int s= a+b;
        return s;
    }
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.print("enter two number=");
        int a= in.nextInt();
        int b=in.nextInt();
        int sum= sum(a,b);
        System.out.println("sum="+sum);
        in.close();
    }
} 
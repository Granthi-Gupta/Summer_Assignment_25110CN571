import java.util.Scanner;

public class Fact {
   static int fact(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        else
            return n* fact(n-1);
    }
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter a number=");
        int num= in.nextInt();
        int f= fact(num);
        System.out.println("the factorial of "+num+" is= "+f);
        in.close();
    }
}

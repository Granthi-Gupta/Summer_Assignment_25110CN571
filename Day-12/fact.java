import java.util.Scanner;

public class fact {
    static int factorial(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
            f*=i;
        return f;
    }
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter a number");
        int num= in.nextInt();
        int fact= factorial(num);
        System.out.println("the factorial="+fact);
        in.close();
    }
    
}

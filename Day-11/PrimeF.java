import java.util.Scanner;
public class PrimeF {
    static boolean isPrime(int n)
    {
        int f=0;
        for(int i=2; i<=n/2; i++)
        {
            if(n%i==0)
                f++;
        }
        if(f==0)
            return true;
        else
            return false;

    }
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter a number");
        int num= in.nextInt();
        if(isPrime(num))
            System.out.println("the number is prime");
        else
            System.out.println("number is not prime");
        in.close();
    }

    
}

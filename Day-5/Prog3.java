import java.util.Scanner;
public class Prog3 {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter a number= ");
        int n= in.nextInt();
        System.out.println("the factors are:");
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
                System.out.println(i);
        }
        in.close();
    }
    
}

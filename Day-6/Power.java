import java.util.Scanner;
public class Power {
    public static void main(String args[])
    {
        int x,a;
        Scanner in= new Scanner(System.in);
        System.out.println("enter a number and its power:");
        x= in.nextInt();
        a=in.nextInt();
        int p=1;
        for(int i=1; i<=a; i++)
        {
           p*=x;
        }
        System.out.println(x+" raise to the power "+a+"= "+p);
        in.close();
    }
}

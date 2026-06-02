import java.util.Scanner;
public class BintoDec {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter a binary number=");
        int n= in.nextInt();
        int i=0, dec=0;
        while(n>0)
        {
            int d= n%10;
            dec+= (int) (Math.pow(2,i)*d);
            i++;
            n/=10;
        }
        System.out.println("the decimal equivalent="+ dec);
        in.close();
    }
}

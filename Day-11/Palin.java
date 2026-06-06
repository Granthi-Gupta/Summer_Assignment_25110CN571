import java.util.Scanner;
public class Palin {
    static int rev(int n)
    {
        int r=0;
        while(n!=0)
        {
            int d=n%10;
            r= r*10+d;
            n=n/10;
        }
        return r;
    }
    public static void main(String args[])
    {
       Scanner in= new Scanner(System.in);
       System.out.println("enter a number");
       int num= in.nextInt();
       int rev = rev(num);
       if(rev==num)
        System.out.println("palindrome number");
       else
        System.out.println("not a palindrome");
       in.close();

    }
    
}

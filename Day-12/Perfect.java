import java.util.Scanner;
public class Perfect {
    static void isPerfect(int num)
    {
        int s=0; int n=num;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s+=i;
            }
        }
        if(num==s)
            System.out.println("the number is a perfect number.");
        else
            System.out.println("the number is not a perfect number.");
    }
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter a number=");
        int n= in.nextInt();
        isPerfect(n);
        in.close();
    }
}

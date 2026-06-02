import java.util.Scanner;
public class Prog1 {
    public static void main(String args[])
    {
    int n;
    System.out.println("enter a number= ");
    Scanner in= new Scanner(System.in);
    n= in.nextInt();
    int sum=0;
    for(int i=1; i<=n/2; i++)
    {
        if(n%i==0)
        {
            sum+=i;
        }
    }
    if(sum==n)
    {
        System.out.println("the number is a perfect number");
    }
    else
        System.out.println("not a perfect number");
    in.close();
    
}
}

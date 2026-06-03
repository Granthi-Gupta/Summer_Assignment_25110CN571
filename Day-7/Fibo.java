import java.util.Scanner;
public class Fibo {
    static int fib(int n)
    {
        if(n==1)
            return 0;
        else if(n==2)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      System.out.println("enter the range of fibonacci series=");
      int n= in.nextInt();
      for(int i=1; i<=n; i++)
      {
        int f= fib(i);
        System.out.print(f+", ");
      }
      in.close();
    }
}

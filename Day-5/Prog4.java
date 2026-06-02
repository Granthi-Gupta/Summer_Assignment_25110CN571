import java.util.Scanner;
public class Prog4 {
    static boolean prime(int a)
    {
      int f=0;
      for(int i=2; i<=a/2; i++)
      {
        if(a%i==0)
            f++;
      }
      if(f==0)
        return true;
    else
        return false;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number:");
        int n= in.nextInt();
        System.out.println("the prime factors are:");
        for(int i=2; i<=n; i++)
            {
                if(n%i==0)
                {
                  if(prime(i))
                  {
                    System.out.println(i);
                  }
                }
            }
            in.close();

    }
}

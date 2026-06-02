import java.util.Scanner;
public class CountSetBits
{
    static int bin(int n)
    {
        String b="";
        while(n>0)
        {
            int d= n%2;
            b= b+d;
            n/=2;
        }
    int bin= Integer.valueOf(b);
    return bin;          
    }
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter a number=");
        int n= in.nextInt();
        int b= bin(n);
        int c=0;
        while(b>0)
        {
          int d= b%10;
          if(d==1)
          {
            c++;
          }
          b/=10;
        }
        System.out.println("the count set digits="+c);
        in.close();
    }
}
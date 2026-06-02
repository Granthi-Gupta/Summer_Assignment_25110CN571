import java.util.Scanner;
public class DectoBin{
    public static void main(String args[])
    {
      Scanner in= new Scanner(System.in);
      System.out.println("enter a decimal number=");
      int n= in.nextInt();
      String dec="";
      if(n==0)
      {
        System.out.println("the binary equivalent is= 0");
      }
      else
      {   
      while(n>0)
      {
        int d= n%2;
        dec=d+dec;
        n/=2;
      }
    System.out.println("the binary equivalent is="+dec);
      }
    in.close();

    }
}

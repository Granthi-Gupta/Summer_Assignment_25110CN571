import java.util.Scanner;
public class Reverse {
    static void rev(int n)
    {
        if(n<=9)
            System.out.print(n);
        else{
            System.out.print(n%10);
            rev(n/10);
        }
    }
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter a number=");
        int n= in.nextInt();
        rev(n);
        in.close();
    }
}

import java.util.Scanner;
public class Sum {
    static int SumDig(int n)
    {
        if(n<=9)
            return n;
        else
            return n%10+SumDig(n/10);
    }
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter a number=");
        int num= in.nextInt();
        int sum= SumDig(num);
        System.out.println("the sum of digits= "+sum);
        in.close();
    }
}

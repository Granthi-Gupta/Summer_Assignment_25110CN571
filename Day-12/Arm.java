import java.util.Scanner;

public class Arm {
    static boolean isArmstrong(int a)
    {
        int d=0, dig=0;
        int num=a;
        while(a!=0)
        {
            a/=10;
            d++;
        }
        int n= num;
        int arm=0;
        while(n!=0)
        {
           dig= n%10;
           arm+= Math.pow(dig,d);
           n/=10;
        }
        if(arm==num)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter a number");
        int n= in.nextInt();
        if(isArmstrong(n))
            System.out.println("number is armstrong");
        else
            System.out.println("not a armstrong number");
        in.close();
    }
    
}

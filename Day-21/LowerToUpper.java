import java.util.Scanner;
public class LowerToUpper {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter a string");
        String s=in.nextLine();
        String up=s.toUpperCase();
        System.out.println("the uppercase String: "+up);
        in.close();
    }
    
}

import java.util.Scanner;
public class ReverseString {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a string");
        String s=in.nextLine();
        String rev="";
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            rev=ch+rev;
        }
        System.out.println("the reverse String: "+rev);
        in.close();
    }
    
}

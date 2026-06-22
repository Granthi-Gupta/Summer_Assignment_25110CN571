import java.util.Scanner;

public class PalinString {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter a string");
        String s= in.nextLine();
        String p="";
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            p=ch+p;
        }
        if(s.compareTo(p)==0)
            System.out.println("The String is Palindrome");
        else
            System.out.println("The String is not Palindrome");
        in.close();
    }
    
}

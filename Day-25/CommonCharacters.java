import java.util.Scanner;
public class CommonCharacters {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter two strings");
        String s1= in.next();
        String s2= in.next();
        System.out.println("common characters are:");
        for(int i=0;i<s1.length();i++)
            {
                char ch= s1.charAt(i);
                if(s2.indexOf(ch)!=-1)
                    System.out.print(ch+" ");
            } 
            in.close();
    }
    
}

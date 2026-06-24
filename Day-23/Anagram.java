import java.util.Scanner;
public class Anagram {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter two Strings");
        String s1=in.next(); int flag=1;
        String s2= in.next();
        if(s1.length()==s2.length())
        {
            for(int i=0;i<s1.length();i++)
            {
                int f1=0,f2=0;
                char c=s1.charAt(i);
                for(int j=0;j<s1.length();j++)
                {
                    if(s1.charAt(j)==c)
                        f1++;
                    if(s2.charAt(j)==c)
                        f2++;
                }
                if(f1!=f2)
                {
                    flag=0;
                    System.out.println("not anagram Strings");
                    break;
                }
            }
        }
        else
        {
            System.out.println("not anagram Strings");
        }
        if(flag==1)
            System.out.println("Strings are anagram");
        in.close();
    }
    
}

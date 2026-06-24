import java.util.Scanner;
public class FirstRepeating {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the String");
        String s=in.nextLine();
        String a="";
        s=s.toUpperCase();
        for(int i=0;i<s.length();i++)
        {
            int f=0;
            char ch=s.charAt(i);
            if(ch!=' ')
            {
            if(a.indexOf(ch)==-1)
            {
                for(int j=0;j<s.length();j++)
                {
                    if(ch==s.charAt(j))
                        f++;
                }
                a=a+ch;
            }
            if(f>1)
            {
                System.out.println("The first repeating character= "+ch);
                break;
            }
        }
        }
        in.close();
    }
    
}

import java.util.Scanner;
public class FirstNon {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter a String");
        String s=in.nextLine();
        String a="";
        for(int i=0;i<s.length();i++)
        {
            int f=0;
            char ch= s.charAt(i);
            for(int j=0;j<s.length();j++)
            {
                if(a.indexOf(s.charAt(j))==-1)
                {
                    if(s.charAt(j)==ch)
                        f++;
                }
            }
            if(a.indexOf(ch)==-1)
                a=a+ch;
            if(f==1)
            {
                System.out.println("The first non repeating character= "+ch);
                break;
            }  
        }
        in.close();
    }
    
}

import java.util.Scanner;
public class CharacterFrequency {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter a String");
        String s=in.nextLine();
        String c="";
        for(int i=0;i<s.length();i++)
        {
            char ch= s.charAt(i);
            int f=0;
            for(int j=0;j<s.length();j++)
            {
                if(c.indexOf(ch)==-1)
                {
                    if(ch==s.charAt(j))
                        f++;
                }
            }
            if(f!=0)
                System.out.println("The frequency of '"+ch+"'="+f);
            c=c+ch;
        }
        in.close();
    }
    
}

import java.util.Scanner;
public class RemoveSpace {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the string");
        String s=in.nextLine();
        String r="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
                r=r+ch;
        }
        System.out.println("the string after removing spaces= "+r);
        in.close();
    }
    
}

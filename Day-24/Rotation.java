import java.util.Scanner;
public class Rotation {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter two Strings");
        String s1= in.next();
        String s2=in.next();
        int l=s1.length(); int flag=0;
        if(l==s2.length())
        {
        for(int i=0;i<s1.length();i++)
        {
            if(s1.equals(s2))
            {
                flag=1;
                System.out.println("Rotation");
                break;
            }
            char last= s1.charAt(s1.length()-1);
            s1=last+s1.substring(0,l-2);
        }
        if(flag==0)
            System.out.println("Rotation");

    }
    else
    {
        System.out.println("Not rotation");
    }
    in.close();
}
}

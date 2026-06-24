import java.util.Scanner;
public class MaximumOccurence {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the String");
        String s= in.nextLine(); int max=0,f1=0;
        char cm='0';
        String a="";
        for(int i=0;i<s.length();i++)
        {
            f1=0;
            char ch=s.charAt(i);
            if(a.indexOf(ch)==-1)
            {
            for(int j=0;j<s.length();j++)
            {
                char c= s.charAt(j);
                if(c==ch)
                    f1++;
            }
            a=a+ch;
        }
        if(f1>max)
        {
            max=f1;
            cm=ch;
        }
    }
    System.out.println("The character with maximum occurence= "+cm+" with frequency= "+max);
    in.close();
}
    
}

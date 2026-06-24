import java.util.Scanner;
public class Longest {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter a sentence");
        String s= in.nextLine();
        int l= s.length(); String longest="";
        String w=""; int len=0,max=0;
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)==' ')
            {
                len=w.length();
                if(len>max)
                {
                    max=len;
                    longest=w;
                }
                w="";
            }
            else
            w=w+s.charAt(i);
            
        }
        if(w.length()>max)
        System.out.println("The longest word= "+w);
    else
        System.out.println("The longest word= "+longest);

        in.close();
    }
    
}

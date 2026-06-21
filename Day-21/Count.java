import java.util.Scanner;

public class Count {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter a string");
        String s=in.nextLine();
        int c=0,vow=0;
        String v="AEIOUaeiou";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(v.indexOf(ch)>-1)
                vow++;
            else
                c++;
        }
        System.out.println("the no. of vowels= "+vow+"\n"+"the no. of consonants= "+c);
        in.close();
    }
    
}

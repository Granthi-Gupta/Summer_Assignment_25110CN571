import java.util.Scanner;
public class CountWords {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter a String");
        String s=in.nextLine();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
                c++;
        }
        System.out.println("the no. of words= "+(c+1));
        in.close();
    }
    
}

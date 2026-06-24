import java.util.Scanner;
public class Compress {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter a String");
        String s=in.next();
        int l= s.length();
        for(int i=0;i<l;i++)
        {
            int f=1;
            char ch=s.charAt(i);
            int j=i+1;
            while((j<l)&&(s.charAt(j)==ch))
            {
                f++;
                j++;
            }
            System.out.print(ch+""+f);
            i=j-1;
        }
        in.close();
    }
    
}

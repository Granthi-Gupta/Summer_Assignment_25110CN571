import java.util.Scanner;
public class Length {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s;
        System.out.println("enter a string");
        s=in.nextLine();
        int l=0;
        for(char c: s.toCharArray())
        {
            l++;
        }
        System.out.println("the length of string= "+l);
        in.close();
    }
    
}

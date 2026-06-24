import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter a string");
        String s= in.nextLine();
        int l= s.length();
        String r="";
        for(int i=0;i<l;i++)
        {
            char ch= s.charAt(i);
            if(r.indexOf(ch)==-1)
                r=r+ch;
            }
         System.out.println("the string after removing duplicates= "+r);
         in.close();
        }
    }
    


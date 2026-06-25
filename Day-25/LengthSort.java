import java.util.Scanner;
public class LengthSort {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the number of Strings to be sorted");
        int s= in.nextInt();
        System.out.println("enter the strings one by one");
        String n[]= new String[s];
        for(int i=0;i<s;i++)
        {
            n[i]=in.next();
        }
        for(int i=0;i<s-1;i++)
        {
            String temp="";
            for(int j=0;j<s-1-i;j++)
            {
                if(n[j].length()>n[j+1].length())
                {
                    temp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }
            }
        }
        System.out.println("sorted array:");
        for(int i=0;i<s;i++)
            System.out.println(n[i]+" ");
        in.close();
    }
    
}

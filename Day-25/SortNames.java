import java.util.Scanner;
public class SortNames {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the number of names that are to be sorted");
        int s=in.nextInt();
        String n[]=new String[s];
        System.out.println("enter the names one by one");
        for(int i=0;i<s;i++)
            n[i]=in.next();
        System.out.println("sorted names:");
        for(int i=0;i<s-1;i++)
        {
            String temp="";
            for(int j=0;j<s-1-i;j++)
            {
                if(n[j].compareToIgnoreCase(n[j+1])>0)
                {
                    temp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }
            }
        }
        for(int i=0;i<s;i++)
            System.out.println(n[i]+" ");

        in.close();
    }
    
}

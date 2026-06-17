import java.util.Scanner;
public class Common {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of first array");
        int s1=in.nextInt();
        int a[]= new int[s1];
        System.out.println("enter the elements of first array");
        for(int i=0;i<s1;i++)
            a[i]=in.nextInt();
        System.out.println("enter the size of second array");
        int s2=in.nextInt();
        int b[]= new int[s2];
        System.out.println("enter the elements of second array");
        for(int i=0;i<s2;i++)
            b[i]=in.nextInt();
        System.out.println("the common elements are=");
        if(s1>s2)
        {
            for(int i=0;i<s1;i++)
            {
                for(int j=0;j<s2;j++)
                {
                    if(a[i]==b[j])
                        System.out.print(a[i]+" ");
                }
            }
        }
        else{
            for(int i=0;i<s2;i++)
            {
                for(int j=0;j<s1;j++)
                {
                    if(b[i]==a[j])
                        System.out.print(b[i]+" ");
                }
            }

        }
        in.close();

    }
    
}

import java.util.Scanner;;

public class Merge {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of first array=");
        int s1=in.nextInt();
        int a[]=new int[s1];
        System.out.println("enter the elements of first array");
        for(int i=0;i<s1;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("enter the size of second array=");
        int s2=in.nextInt();
        int b[]=new int[s2];
        System.out.println("enter the elements of second array");
        for(int i=0;i<s2;i++)
        {
            b[i]=in.nextInt();
        }
        int s=s1+s2;
        int c[]=new int[s];
        for(int i=0;i<s1;i++)
            c[i]=a[i];
        int k=0;
        for(int i=s1;i<s;i++)
        {
            c[i]=b[k];
            k++;
        }
        System.out.println("the merged array=");
        for(int i=0;i<s;i++)
            System.out.print(c[i]+" ");
        in.close();


    
    }
    
}

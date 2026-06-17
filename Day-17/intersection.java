import java.util.Scanner;
public class intersection {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of first array");
        int s1=in.nextInt();
        System.out.println("enter the elements of first array");
        int a[]=new int[s1];
        System.out.println("enter the elments of first array");
        for(int i=0;i<s1;i++)
            a[i]=in.nextInt();
        System.out.println("enter the size of second array");
        int s2=in.nextInt();
        System.out.println("enter the elements of second array");
        int b[]=new int[s1];
        System.out.println("enter the elments of second array");
        for(int i=0;i<s2;i++)
            b[i]=in.nextInt();
        int c[]=new int[s1+s2]; int k=0;
        if(s1>s2)
        {
            for(int i=0;i<s1;i++)
            {
                int e=a[i];
                for(int j=0;j<s2;j++)
                {
                    if(e==b[j])
                    {
                        c[k]=b[j];
                        k++;

                    }
                }
            }
        }
            else
            {
            for(int i=0;i<s2;i++)
            {
                int e=b[i];
                for(int j=0;j<s1;j++)
                {
                    if(e==a[j])
                    {
                        c[k]=a[j];
                        k++;

                    }
                }
            }
            }
            System.out.println("the intersection=");
            for(int i=0;i<s1+s2;i++)
                System.out.println(c[i]+" ");
            in.close();
        }
    }
    


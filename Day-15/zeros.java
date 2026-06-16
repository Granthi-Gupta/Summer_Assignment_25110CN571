import java.util.Scanner;
public class zeros {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of array");
        int s=in.nextInt(); int a[]=new int[s];
        System.out.println("enter the array elements");
        for(int i=0;i<s;i++)
            a[i]=in.nextInt();
        int b[]=new int[s]; int c=0;
        for(int i=0;i<s;i++)
        {
            if(a[i]!=0)
            {
                b[c]=a[i];
                c++;
            }
        }
        System.out.println("array after putting all the zerors to the end:-");
        for(int i=0;i<s;i++)
            System.out.print(b[i]+" ");
        in.close();

    }
    
}

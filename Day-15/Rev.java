import java.util.Scanner;
public class Rev {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of array");
        int s= in.nextInt();
        int a[]=new int[s];
        System.out.println("enter the array elements");
        for(int i=0;i<s;i++)
        {
            a[i]=in.nextInt();
        }
        int rev[]= new int[s]; int c=0;
        for(int i=s-1;i>=0;i--)
        {
            rev[c]=a[i];
            c++;
        }
        System.out.println("the reversed array=");
        for(int i=0;i<s;i++)
        {
            System.out.println(rev[i]);
        }
        in.close();
    }
}

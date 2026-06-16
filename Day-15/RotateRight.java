import java.util.Scanner;
public class RotateRight {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of array");
        int s=in.nextInt();
        System.out.println("enter the elements of array");
        int a[]=new int[s]; int b[]=new int[s];
        for(int i=0;i<s;i++)
        {
            a[i]=in.nextInt();
            b[i]=a[i];

        }
        System.out.println("enter the position by which rotation has to be done");
        int d=in.nextInt();
        int r[]=new int[d];int c=d-1;
        for(int i=s-1;i>=s-d;i--)
        {
            r[c]=a[i];
            c--;
        }
        for(int i=0;i<=d;i++)
        {
            a[i+d]=b[i];
        }
        for(int i=0;i<d;i++)
        {
            a[i]=r[i];
        }
        System.out.println("the rotated array is:-");
        for(int i=0;i<s;i++)
        {
            System.out.print(a[i]+" ");
        }
        in.close();


    }
}

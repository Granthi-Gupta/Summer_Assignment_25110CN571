import java.util.Scanner;
public class EvenOdd {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of array");
        int s=in.nextInt();
        int a[]= new int[s];
        System.out.println("enter the elements of array");
        for(int i=0;i<s;i++)
        {
            a[i]= in.nextInt();
        }
        int even[]=new int[s],odd[]=new int[s],e=0,o=0;
        for(int i=0;i<s;i++)
        {
            if(a[i]%2==0)
            {
                even[e]=a[i];
                e++;
            }
            else{
                odd[o]=a[i];
                o++;
            }
                
        }
        System.out.println("the odd numbers are:-");
        int l1= odd.length;
        int l2= even.length;
        for(int i=0;i<l1;i++)
        {
            System.out.print(odd[i]+", ");
        }
        System.out.println();
        System.out.println("the even numbers are:-");
        for(int i=0;i<l2;i++)
        {
            System.out.print(even[i]+", ");
        }
        in.close();
    }
}

import java.util.Scanner;
public class LargestAndSmallest {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int s= in.nextInt();
        System.out.println("enter the array elements");
        int a[]= new int[s];
        for(int i=0;i<s;i++)
        {
            a[i]=in.nextInt();
        }
        int sm=a[0],la=a[0];
        for(int i=1;i<s;i++)
        {
            if(a[i]>a[i-1])
                la=a[i];
            if(a[i]<a[i-1])
                sm= a[i];
        }
        System.out.println("the smallest= "+sm+"\n"+"the largest= "+la);
        in.close();
    }
}

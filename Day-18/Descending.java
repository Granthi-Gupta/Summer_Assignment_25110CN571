import java.util.Scanner;
public class Descending {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of array");
        int s= in.nextInt();
        int a[]=new int[s];
        System.out.println("enter array elements");
        for(int i=0;i<s;i++)
            a[i]=in.nextInt();
        for(int i=0;i<s;i++)
        {
            int temp=0;
            for(int j=0;j<s-1-i;j++)
            {
                if(a[j]<a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("sorted array:");
        for(int i=0;i<s;i++)
            System.out.print(a[i]+" ");
        in.close();
    }
    
}

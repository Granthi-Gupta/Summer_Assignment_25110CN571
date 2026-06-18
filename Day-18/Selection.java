import java.util.Scanner;
public class Selection {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of array");
        int s=in.nextInt();
        System.out.println("enter the elements of array");
        int a[]=new int[s];
        for(int i=0;i<s;i++)
        {
            a[i]=in.nextInt();
        }
        for(int i=0;i<s;i++)
        {
            int min=i;
            for(int j=i+1;j<s;j++)
            {
                if(a[j]<a[i])
                    min=j;
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        System.out.println("the sorted array=");
        for(int i=0;i<s;i++)
            System.out.print(a[i]+" ");
        in.close();
        

    }
    
}

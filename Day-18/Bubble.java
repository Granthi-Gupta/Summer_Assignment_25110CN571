import java.util.Scanner;
public class Bubble {
    public static void main(String arga[])
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
        for(int i=0;i<s-1;i++)
        {
            int temp=0;
            for(int j=0;j<s-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("the sorted array:");
        for(int i=0;i<s;i++)
            System.out.print(a[i]+" ");
        in.close();

    }
    
}

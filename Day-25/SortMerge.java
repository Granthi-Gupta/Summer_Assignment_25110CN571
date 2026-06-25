import java.util.Scanner;

public class SortMerge {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int n1=in.nextInt();
        int a[]=new int[n1];
        System.out.println("enter the elements of first array");
        for(int i=0;i<n1;i++)
            a[i]=in.nextInt();
        System.out.println("Enter the size of second array");
        int n2=in.nextInt();
        int b[]=new int[n2];
        System.out.println("enter the elements of second array");
        for(int i=0;i<n2;i++)
            b[i]=in.nextInt();
        int c[]= new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1&&j<n2)
        {
            if(a[i]<=b[j])
                c[k++]=a[i++];
            else
                c[k++]=b[j++];

        }
        while(i<n1)  
            c[k++]=a[i++];
        while(j<n2)
            c[k++]=b[j++];
        System.out.println("merged array=");
        for( i=0;i<c.length;i++)
            System.out.println(c[i]);
        in.close();





        
    }
    
}

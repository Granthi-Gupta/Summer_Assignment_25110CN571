import java.util.Scanner;
public class Add {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the no. of rows and columns matrix");
        int m=in.nextInt();
        int n=in.nextInt();
        int a[][]=new int[m][n];
        System.out.println("enter the elements of first matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                a[i][j]=in.nextInt();
        }
        int b[][]=new int[m][n];
        System.out.println("enter the elements of second matrix");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                b[i][j]=in.nextInt();
        }
        int c[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                c[i][j]=a[i][j]+b[i][j];
        }
        System.out.println("the sum=");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(c[i][j]+" ");
            System.out.println();
        }
        in.close();



    }
    
}

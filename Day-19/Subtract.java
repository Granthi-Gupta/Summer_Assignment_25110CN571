import java.util.Scanner;
public class Subtract {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the number of rows and column");
        int m=in.nextInt();
        int n= in.nextInt();
        System.out.println("enter the elements of matrix");
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                a[i][j]=in.nextInt();
        }
        System.out.println("enter the elements of matrix");
        int b[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                b[i][j]=in.nextInt();
        }
        int s[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                s[i][j]=a[i][j]-b[i][j];
        }
        System.out.println("the difference=");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(s[i][j]+" ");
            System.out.println();
}
in.close();

    }
    
}

import java.util.Scanner;
public class Transpose {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the no. of rows and columns in matrix");
        int m=in.nextInt();
        int n= in.nextInt();
        int a[][]=new int [m][n];
        System.out.println("enter the elements of matrix");
        int t[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=in.nextInt();
                t[j][i]=a[i][j];
            }
        }
        System.out.println("the transpose=");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(t[i][j]+" ");
            System.out.println();
        }
        in.close();
    }
    
}

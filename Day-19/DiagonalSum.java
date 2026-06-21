import java.util.Scanner;
public class DiagonalSum {
    public static void main(String args[])

    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number of rows and columns of the matrix");
        int m=in.nextInt();
        int n=in.nextInt();
        int a[][]=new int[m][n];
        System.out.println("enter the elements of matrix row wise");
        int sum=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=in.nextInt();
                if(i==j)
                    sum+=a[i][j];
            }
        }
        System.out.println("the sum of diagonal elements= "+sum);
        in.close();
    }
    
}

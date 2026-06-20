import java.util.Scanner;

public class Multiply {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of array");
        int s=in.nextInt();
        System.out.println("enter first matrix elements");
        int a[][]= new int[s][s];
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            a[i][j]=in.nextInt();
    }
    System.out.println("enter second matrix elements");
        int b[][]= new int[s][s];
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            b[i][j]=in.nextInt();
    }
    int m[][]=new int[s][s];
    for(int i=0;i<s;i++)
    {
        for(int j=0;j<s;j++)
        {
            for(int k=0;k<s;k++)
            {
                m[i][j]+=a[i][k]*b[k][j];
            }
        }
    }
    System.out.println("the resultant matrix");
    for(int i=0;i<s;i++)
    {
        for(int j=0;j<s;j++)
            System.out.print(m[i][j]+" ");
        System.out.println();
    }
    in.close();
    
}
}

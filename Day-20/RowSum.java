import java.util.Scanner;
public class RowSum {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of square matrix");
        int s=in.nextInt();
        System.out.println("enter the elements of matrix");
        int a[][]=new int[s][s];
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
                a[i][j]=in.nextInt();
        }
        for(int i=0;i<s;i++)
        {
            int sum=0;
            for(int j=0;j<s;j++)
            {
                sum+=a[i][j];
            }
            System.out.println("the sum of "+i+1+"th row= "+sum);
        }
        in.close();
    }
    
}

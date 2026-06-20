import java.util.Scanner;
 public class ColumnSum {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of matrix");
        int s=in.nextInt();
        int a[][]=new int[s][s];
        System.out.println("enter the elements of matrix");
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
                a[i][j]=in.nextInt();
        }
        for(int i=0;i<s;i++)
        {
            int sum=0;
            for(int j=0;j<s;j++)
                sum+=a[j][i];
            System.out.println("the sum of "+(i+1)+"th column= "+sum);
        }
        in.close();
    }
    
}

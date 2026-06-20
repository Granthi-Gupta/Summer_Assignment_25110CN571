import java.util.Scanner;
public class Symmetric {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of matrix");
        int s=in.nextInt();
        System.out.println("enter the elements of matrix");
        int a[][]=new int[s][s];
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
                a[i][j]=in.nextInt();
        }
        int c=0;
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                if(i!=j)
                {
                    if(a[i][j]!=a[j][i])
                    {
                        c=1;
                        break;
                    }
                }
            }
        }
        if(c==0)
        System.out.println("symmetric matrix");
        else
            System.out.println("not a symmetric matrix ");
        in.close();

    }
    
}

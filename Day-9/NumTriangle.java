import java.util.Scanner;
public class NumTriangle {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the size of the triangle");
        int s= in.nextInt();
        for(int i=s-1; i>=0; i--)
        {
            int n=1;
            for(int j=0; j<=i; j++)
            {
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
            
        }
        in.close();
    }
}

import java.util.Scanner;
public class StarTriangle {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the size of Triangle=");
        int s= in.nextInt();
        for(int i=s; i>0; i--)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        in.close();
    }
}

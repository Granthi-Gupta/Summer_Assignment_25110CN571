import java.util.Scanner;
public class AlphaTri {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of triangle=");
        int s= in.nextInt();
        int n=65;
        for(int i=0; i<s; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print((char)n);
            }
            n++;
            System.out.println();
        }
        in.close();
    }
}

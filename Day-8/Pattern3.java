import java.util.Scanner;
public class Pattern3 {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of pattern=");
        int s= in.nextInt();
        int n=1;
        for(int i=0; i<s; i++)
        { 
            for(int j=0; j<=i;j++)
            {
               System.out.print(n);
            }
            n++;
            System.out.println();
        }
        in.close();
    }
}

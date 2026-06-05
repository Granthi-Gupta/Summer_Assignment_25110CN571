import java.util.Scanner;

public class RevPyramid {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of pyramid");
        int s= in.nextInt();
        int mid= s-1;
        for(int i=s-1; i>=0; i--)
        {
            for(int j=0; j<s*2-1; j++)
            {
                if((j>=mid-i)&&(j<=mid+i))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        in.close();
    }
}

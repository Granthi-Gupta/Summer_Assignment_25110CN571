import java.util.Scanner;
public class Max {
    static int maximum (int a,int b)
    {
        int max= a>b?a:b;
        return max;
     
    }
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter two numbers");
        int x= in.nextInt();
        int y= in.nextInt();
        int m= maximum(x,y);
        System.out.println("the maximum="+m);
        in.close();
    }
}

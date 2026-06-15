import java.util.Scanner;
public class Display {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of array=");
        int s= in.nextInt();
        System.out.println("enter the elements of array");
        int a[]=new int[s];
        for(int i=0;i<s;i++)
        {
            a[i]= in.nextInt();
        }
        System.out.println("the elements of the array are:-");
        for(int i=0;i<s;i++)
        {
            System.out.print(a[i]+", ");
        }
        in.close();

    }
}

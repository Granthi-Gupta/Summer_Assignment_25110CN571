import java.util.Scanner;
public class Average {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of array");
        int l= in.nextInt();
        int a[]=new int[l]; int s=0;
        float av;
        System.out.println("enter the elements of array:-");
        for(int i=0;i<l;i++)
        {
            a[i]=in.nextInt();
            s+=a[i];
        }
        av=s/l;
        System.out.println("the sum of elements= "+s+"\n"+"the average of elements= "+av);
        in.close();
    }
}

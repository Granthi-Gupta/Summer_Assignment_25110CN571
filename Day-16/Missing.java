import java.util.Scanner;

public class Missing {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of array");
        int s= in.nextInt();
        int a[]=new int[s-1];
        System.out.println("enter the elements of array");
        int sum=0;
        for(int i=0;i<s-1;i++)
        {
            a[i]=in.nextInt();
            sum+=a[i];
        }
        int sumO=0;
        for(int i=1;i<=s;i++)
            sumO+=i;
        int miss=sumO-sum;
        System.out.println("the missing number="+miss);
        in.close();

    }
    
}

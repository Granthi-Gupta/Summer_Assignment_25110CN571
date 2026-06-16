import java.util.Scanner;
public class PairSum {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of array");
        int s=in.nextInt();
        int arr[]=new int[s];
        System.out.println("enter the elements of array");
        for(int i=0;i<s;i++)
            arr[i]=in.nextInt();
        System.out.println("enter the sum");
        int sum=in.nextInt(); int a=0,b=0;
        for(int i=0;i<s;i++)
        {
             a= arr[i];
             b=sum-a;
            for(int j=0;j<s;j++)
            {
               if(arr[j]==b)
               {
                System.out.println("the pair with sum= "+sum+" is "+a+" and "+b);
               }
                
            }
            
        }
        in.close();

    }
}

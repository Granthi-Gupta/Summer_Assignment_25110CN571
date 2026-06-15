import java.util.Scanner;
public class SecondLargest {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the length of array");
        int l= in.nextInt();
        System.out.println("enter the elements of array=");
        int arr[]= new int[l];
        for(int i=0; i<l;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0; i<l-1;i++)
        {
            int temp=0;
            for(int j=0; j<l-1-i;j++)
            {
                if(arr[i]>arr[i+1])
                {
                    arr[i]=temp;
                    temp= arr[i+1];
                    arr[i+1]=arr[i];
                }
            }
        }
        System.out.println("the second largest element="+arr[l-2]);
        in.close();
}
}

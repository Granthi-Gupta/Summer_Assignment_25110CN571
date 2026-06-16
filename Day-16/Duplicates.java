import java.util.Scanner;
public class Duplicates {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of array");
        int s= in.nextInt();
        System.out.println("enter the elements of array");
        int arr[]= new int[s];
        for(int i=0;i<s;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0;i<s;i++)
        {
            int e=arr[i];
            for(int j=i+1;j<s;j++)
            {
                if(e==arr[j])
                    arr[j]=0;
            }
        }
        for(int i=0;i<s;i++)
            System.out.print(arr[i]+" ");
        in.close();
    }
    
}

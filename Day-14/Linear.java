import java.util.Scanner;
public class Linear {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the length of array ");
        int l= in.nextInt();
        System.out.println("Enter the elements of an array");
        int arr[]= new int[l];
        for(int i=0; i<l;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("enter the element to be searched=");
        int key= in.nextInt();
        int c=0;
        for(int i=0;i<l;i++)
        {
            if(key==arr[i])
            {
                c=i;
                break;
            }

        }
        if(c!=0)
        System.out.println("Element found on index= "+c);
        else
            System.out.println("element not found");
        in.close();
    }
}

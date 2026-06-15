import java.util.Scanner;
public class Freq {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of array");
        int l=in.nextInt();
        int arr[]= new int[l];
        System.out.println("enter the elements of array=");
        for(int i=0;i<l;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("enter the element whose frequency is to be calculated");
        int key= in.nextInt();
        int f=0;
        for(int i=0; i<l;i++)
        {
            if(key==arr[i])
                f++;
        }
        System.out.println("the frequency of "+key+"= "+f);
        in.close();
    }
}

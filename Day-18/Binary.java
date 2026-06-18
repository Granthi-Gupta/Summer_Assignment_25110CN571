import java.util.Scanner;
public class Binary {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of array");
        int s= in.nextInt();
        System.out.println("enter the elements of array");
        int a[]=new int[s];
        for(int i=0;i<s;i++)
            a[i]=in.nextInt();
        System.out.println("enter the element to be searched");
        int key= in.nextInt();
        int mid=s/2;
        int lb=0,ub=s-1; int c=0;
        while(lb!=ub)
        {
            mid= lb+ub/2;
            if(a[mid]>key)
                ub=mid-1;
            else if(a[mid]<key)
                lb=mid+1;
            else
            {
                c=1;
                break;
            }

        }
        if(c==1)
            System.out.println("element found successfully!");
        else
            System.out.println("not found element");
        in.close();
            
    }
    
}

import java.util.Scanner;
public class RotateLeft {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of array=");
        int s= in.nextInt();
        int a[]=new int[s];
        System.out.println("enter the elements of array:-");
        for(int i=0;i<s;i++)
        {
            a[i]= in.nextInt();
        }
        System.out.println("enter the position by which rotation will take place:");
        int d=in.nextInt();
        int r[]=new int[d]; int c=0;
        for(int i=0;i<d;i++)
        {
           r[c]=a[i];
           c++;
           a[i]=0;
        }c=0; int temp=0;
        for(int i=0;i<s;i++)
        {
            if((a[i]!=0))
            {
                temp=a[i];
                a[i]=a[c];
                a[c]=temp;
                c++;                                                                                                                                                                      
            }

        }c=0;
        for(int i=0;i<s;i++)
        {
            if(a[i]==0)
            {
                a[i]=r[c];
                c++;
            }
        }
        for(int i=0;i<s;i++)
        {
            System.out.print(a[i]+" ");
        }
        in.close();


    }
}

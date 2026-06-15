import java.util.Scanner;
public class Duplicates {
    static int indexOf(int x,int ar[])
    {
        int in=-1;
        int l= ar.length;
        for(int i=0; i<l;i++)
        {
            if(ar[i]==x)
            {
                in=0;
                break;
            }
         
        }
        return in;
    }
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of array");
        int l= in.nextInt();
        System.out.println("enter the elements of array");
        int a[]=new int[l];
        for(int i=0;i<l;i++)
        {
            a[i]=in.nextInt();

        }
        int d[]=new int[l], c=0,f=0;
        for(int i=0;i<l;i++)
        {
            int e=a[i];
            int index=indexOf(e,d);
            if(index==-1)
            {    
            for(int j=0;j<l;j++)
            {
              if(e==a[j])
              {
                d[c]=a[j];
                f++; c++;
              }
            }
            System.out.println("the duplicates of "+e+"= "+(f-1));
            f=0;
        }
            
      }
      in.close();
    }
}

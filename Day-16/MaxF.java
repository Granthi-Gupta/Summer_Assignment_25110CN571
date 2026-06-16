import java.util.Scanner;
public class MaxF {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of an array");
        int s= in.nextInt();
        int a[]=new int[s];
        System.out.println("enter the array elements");
        for(int i=0;i<s;i++)
            a[i]=in.nextInt();
        int f1=0,fm=0,f2=0;
        for(int i=0;i<s;i++)
        {
            int e= a[i];
            f1=0;
            for(int j=0;j<s;j++)
            {
              if(a[j]==e)
                f1++;
            }
            if(f1>fm)
            {
                f2=a[i];
                fm=f1;
            }
            
        }
        System.out.println("the element with highest frequency= "+f2+"\n"+"frequency= "+fm);
        in.close();
    }
    
}

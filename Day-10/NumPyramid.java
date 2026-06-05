import java.util.Scanner;
public class NumPyramid {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of the pyramid=");
        int s= in.nextInt();
        int mid= s-1; int n=1;
        for(int i=0; i<s; i++)
        {
            
            for(int j=0; j<s*2-1; j++)
            {
                if((j>=mid-i)&&(j<=mid+i))
                {
                    System.out.print(n+" ");
                    if(j<mid)
                        n++;
                    else n--;

                }
                        
                else
                    System.out.print("  ");
            }
            n=1;
            System.out.println();
        }
        in.close();
    }
}

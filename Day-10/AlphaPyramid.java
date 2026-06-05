import java.util.Scanner;
public class AlphaPyramid {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the size of pyramid");
        int s= in.nextInt();
        int n= 65, mid= s-1;
        for(int i=0; i<s; i++)
        {
            for(int j=0; j<s*2-1; j++)
            {
                if((j>=mid-i)&&(j<=mid+i))
                {
                    System.out.print((char)n+" ");
                    if(j<mid)
                        n++;
                    else
                        n--;
                }
                else
                    System.out.print("  ");
            }
       
            n=65;
            System.out.println();
        
        in.close();
    }
}
}

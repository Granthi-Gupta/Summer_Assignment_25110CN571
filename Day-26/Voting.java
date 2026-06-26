import java.util.Scanner;
public class Voting {
    public static void main(String  args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter your age");
        int a=in.nextInt();
        if(a>=18)
            System.out.println("you are eligible to vote");
        else
        {
            System.out.println("you are not eligible to vote."+"\n"+"come after "+(18-a)+" years.");
        }
        in.close();
    }
    
}

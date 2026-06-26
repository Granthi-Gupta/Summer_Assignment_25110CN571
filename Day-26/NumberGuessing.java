import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        Random random= new Random();
        int num=random.nextInt(100)+1;
        int g;
        System.out.println("guess the number between 1 and 100");
        do
        {
            System.out.println("guess the number and enter");
            g=in.nextInt();
            if(g>num)
                System.out.println("too high!");
            else if(g<num)
                System.out.println("too low!");
            else
                System.out.println("Congratulations! you guessed it");
        }
        while(g!=num);
        in.close();
        
    }
    
}

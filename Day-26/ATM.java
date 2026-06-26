import java.util.Scanner;
public class ATM {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        double bal= 10000; int ch=0;
        do{
        System.out.println("Enter your Choice:"+"\n"+"1) Deposit Money"+"\n"+"2) Withdraw Money"+"\n"+"3) Check Balance"+"\n"+"4) Exit");
        ch=in.nextInt();
        switch(ch)
        {
        case 1:
            System.out.println("enter the amount to be Deposited");
            int d=in.nextInt();
            bal= bal+d;
            System.out.println("Current Balance= "+bal);
            break;
        case 2:
            System.out.println("enter the amount to be withdrawn:");
            int w= in.nextInt();
            bal= bal-w;
            if(bal>0)
            System.out.println("Current Balance= "+bal);
            else
                System.out.println("not enough balance");
            break;
        case 3:
            System.out.println("Current Balance= "+bal);
            break;
        case 4:
            System.out.println("thank you for using this system.");
            break;
        default:
            System.out.println("invalid choice");
}
}while(ch!=4);
in.close();


    }
    
}

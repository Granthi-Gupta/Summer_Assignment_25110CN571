import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int ch;
        double num1, num2, res;

        do {
            System.out.println("\nMENU DRIVEN CALCULATOR ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            ch= in.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter first number: ");
                    num1 = in.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = in.nextDouble();
                    res = num1 + num2;
                    System.out.println("Result = " + res);
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    num1 = in.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = in.nextDouble();
                    res = num1 - num2;
                    System.out.println("Result = " + res);
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    num1 = in.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = in.nextDouble();
                    res = num1 * num2;
                    System.out.println("Result = " + res);
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    num1 = in.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = in.nextDouble();

                    if (num2 != 0) {
                        res = num1 / num2;
                        System.out.println("Result = " + res);
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;

                case 5:
                    System.out.print("Enter first number: ");
                    num1 = in.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = in.nextDouble();

                    if (num2 != 0) {
                        res = num1 % num2;
                        System.out.println("Result = " + res);
                    } else {
                        System.out.println("Modulus by zero is not allowed.");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using the calculator.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (ch != 6);

        in.close();
    }
}
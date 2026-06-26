import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s = 0;
        int ans;

        System.out.println("===== Welcome to the Quiz =====");

        // Question 1
        System.out.println("\n1. What is the capital of India?");
        System.out.println("1. Mumbai");
        System.out.println("2. New Delhi");
        System.out.println("3. Kolkata");
        System.out.println("4. Chennai");
        System.out.print("Enter your answer: ");
        ans = sc.nextInt();
        if (ans == 2) {
            s++;
        }

        // Question 2
        System.out.println("\n2. Which language is used for Java programming?");
        System.out.println("1. Java");
        System.out.println("2. Python");
        System.out.println("3. C");
        System.out.println("4. HTML");
        System.out.print("Enter your answer: ");
        ans = sc.nextInt();
        if (ans == 1) {
            s++;
        }

        // Question 3
        System.out.println("\n3. How many days are there in a week?");
        System.out.println("1. 5");
        System.out.println("2. 6");
        System.out.println("3. 7");
        System.out.println("4. 8");
        System.out.print("Enter your answer: ");
        ans = sc.nextInt();
        if (ans == 3) {
            s++;
        }

        // Question 4
        System.out.println("\n4. Which planet is known as the Red Planet?");
        System.out.println("1. Earth");
        System.out.println("2. Venus");
        System.out.println("3. Mars");
        System.out.println("4. Jupiter");
        System.out.print("Enter your answer: ");
        ans= sc.nextInt();
        if (ans == 3) {
            s++;
        }

        // Question 5
        System.out.println("\n5. What is 10 + 5?");
        System.out.println("1. 12");
        System.out.println("2. 15");
        System.out.println("3. 20");
        System.out.println("4. 25");
        System.out.print("Enter your answer: ");
        ans = sc.nextInt();
        if (ans== 2) {
            s++;
        }

        System.out.println("\n===== Quiz Completed =====");
        System.out.println("Your Score: " + s + " out of 5");

        if (s == 5) {
            System.out.println("Excellent!");
        } else if (s >= 3) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Keep Practicing!");
        }

        sc.close();
    }
}

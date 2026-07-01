import java.util.ArrayList;
import java.util.Scanner;

// Expense class (OOP concept)
class Expense {
    String n;
    double amt;
    String c;

    Expense(String name, double amount, String category) {
        this.n = name;
        this.amt = amount;
        this.c = category;
    }
}

public class ExpenseTracker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Expense> expenses = new ArrayList<>();

        int ch;

        do {
            System.out.println("\n===== ADVANCED EXPENSE TRACKER =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Total Expense");
            System.out.println("4. Category-wise Total");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            ch = in.nextInt();
            in.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter expense name: ");
                    String name = in.nextLine();

                    System.out.print("Enter amount: ");
                    double amt = in.nextDouble();
                    in.nextLine();

                    System.out.print("Enter category (Food/Travel/Shopping/Bills/Other): ");
                    String categ= in.nextLine();

                    expenses.add(new Expense(name, amt, categ));
                    System.out.println("Expense added successfully!");
                    break;

                case 2:
                    System.out.println("\n--- Expense List ---");
                    if (expenses.isEmpty()) {
                        System.out.println("No expenses found.");
                    } else {
                        for (int i = 0; i < expenses.size(); i++) {
                            Expense e = expenses.get(i);
                            System.out.println((i + 1) + ". " +
                                    e.n + " | ₹" + e.amt +
                                    " | " + e.c);
                        }
                    }
                    break;

                case 3:
                    double total = 0;
                    for (Expense e : expenses) {
                        total += e.amt;
                    }
                    System.out.println("Total Expense: ₹" + total);
                    break;

                case 4:
                    System.out.print("Enter category to calculate total: ");
                    String cat = in.nextLine();

                    double catTotal = 0;
                    for (Expense e : expenses) {
                        if (e.c.equalsIgnoreCase(cat)) {
                            catTotal += e.amt;
                        }
                    }

                    System.out.println("Total for " + cat + ": ₹" + catTotal);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (ch != 5);

        in.close();
    }
}
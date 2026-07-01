import java.util.Scanner;

public class MiniLibrarySystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = in.nextInt();
        in.nextLine(); // Consume newline

        String[] t = new String[n];
        String[] auth = new String[n];
        boolean[] issue = new boolean[n];

        // Input book details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Book " + (i + 1));

            System.out.print("Book Title: ");
            t[i] = in.nextLine();

            System.out.print("Author Name: ");
            auth[i] = in.nextLine();

            issue[i] = false; // Initially all books are available
        }

        int ch;

        do {
            System.out.println("\n===== MINI LIBRARY SYSTEM =====");
            System.out.println("1. Display Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            ch = in.nextInt();
            in.nextLine();

            switch (ch) {
                case 1:
                    System.out.println("\nBook List:");
                    System.out.println("No.\tTitle\t\tAuthor\t\tStatus");
                    for (int i = 0; i < n; i++) {
                        System.out.println((i + 1) + "\t" + t[i] + "\t\t" +
                                auth[i] + "\t\t" +
                                (issue[i] ? "Issued" : "Available"));
                    }
                    break;

                case 2:
                    System.out.print("Enter book number to issue: ");
                    int i= in.nextInt();

                    if (i >= 1 && i <= n) {
                        if (!issue[i - 1]) {
                            issue[i - 1] = true;
                            System.out.println("Book issued successfully.");
                        } else {
                            System.out.println("Book is already issued.");
                        }
                    } else {
                        System.out.println("Invalid book number.");
                    }
                    break;

                case 3:
                    System.out.print("Enter book number to return: ");
                    int ret = in.nextInt();

                    if (ret >= 1 && ret <= n) {
                        if (issue[ret - 1]) {
                            issue[ret - 1] = false;
                            System.out.println("Book returned successfully.");
                        } else {
                            System.out.println("Book was not issued.");
                        }
                    } else {
                        System.out.println("Invalid book number.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the Library System!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (ch!= 4);

        in.close();
    }
}
import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int id;
    String title;
    String auth;
    boolean issue;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.auth = author;
        this.issue = false;
    }

    void display() {
        System.out.println("Book ID : " + id);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + auth);
        System.out.println("Status  : " + (issue ? "Issued" : "Available"));
        System.out.println("---------------------------");
    }
}

public class LibraryManagement{

    static ArrayList<Book> books = new ArrayList<>();
    static Scanner in = new Scanner(System.in);

    static void addBook() {
        System.out.print("Enter Book ID: ");
        int id = in.nextInt();
        in.nextLine();

        System.out.print("Enter Book Title: ");
        String title = in.nextLine();

        System.out.print("Enter Author Name: ");
        String author = in.nextLine();

        books.add(new Book(id, title, author));
        System.out.println("Book added successfully.");
    }

    static void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book b : books) {
            b.display();
        }
    }

    static void issueBook() {
        System.out.print("Enter Book ID to issue: ");
        int id = in.nextInt();

        for (Book b : books) {
            if (b.id == id) {
                if (!b.issue) {
                    b.issue = true;
                    System.out.println("Book issued successfully.");
                } else {
                    System.out.println("Book is already issued.");
                }
                return;
            }
        }

        System.out.println("Book not found.");
    }

    static void returnBook() {
        System.out.print("Enter Book ID to return: ");
        int id = in.nextInt();

        for (Book b : books) {
            if (b.id == id) {
                if (b.issue) {
                    b.issue = false;
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("This book was not issued.");
                }
                return;
            }
        }

        System.out.println("Book not found.");
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = in.nextInt();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    viewBooks();
                    break;
                case 3:
                    issueBook();
                    break;
                case 4:
                    returnBook();
                    break;
                case 5:
                    System.out.println("Thank you for using the Library Management System.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);
    }
}
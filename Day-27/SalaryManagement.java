import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    double basicSalary;
    double hra;
    double da;
    double pf;
    double netSalary;

    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;

        // Calculate salary components
        hra = basicSalary * 0.20;
        da = basicSalary * 0.10;
        pf = basicSalary * 0.08;

        // Net salary
        netSalary = basicSalary + hra + da - pf;
    }

    void showDetails() {
        System.out.println("\nEmployee ID   : " + id);
        System.out.println("Name          : " + name);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("PF            : " + pf);
        System.out.println("Net Salary    : " + netSalary);
    }
}

public class SalaryManagement{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n====== Salary Management System ======");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = in.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = in.nextInt();
                    in.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = in.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    double salary = in.nextDouble();

                    Employee emp = new Employee(id, name, salary);
                    list.add(emp);

                    System.out.println("Employee added successfully!");
                    break;

                case 2:
                    if (list.isEmpty()) {
                        System.out.println("No employee records available.");
                    } else {
                        for (Employee e : list) {
                            e.showDetails();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = in.nextInt();

                    boolean found = false;

                    for (Employee e : list) {
                        if (e.id == searchId) {
                            e.showDetails();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the Salary Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        in.close();
    }
}

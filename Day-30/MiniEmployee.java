import java.util.Scanner;

public class MiniEmployee{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = in.nextInt();
        in.nextLine();

        String[] name = new String[n];
        String[] dept = new String[n];
        int[] id = new int[n];
        double[] sal= new double[n];
        boolean[] stat = new boolean[n];

        // Input employee details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Employee " + (i + 1));

            System.out.print("Employee ID: ");
            id[i] = in.nextInt();
            in.nextLine();
            System.out.print("Name: ");
            name[i] = in.nextLine();

            System.out.print("Department: ");
            dept[i] = in.nextLine();

            System.out.print("Salary: ");
            sal[i] = in.nextDouble();

            stat[i] = true; // all employees initially active
        }

        int ch;

        do {
            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Display Employees");
            System.out.println("2. Search Employee by ID");
            System.out.println("3. Mark Employee as Resigned");
            System.out.println("4. Show Active Employees");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            ch = in.nextInt();

            switch (ch) {

                case 1:
                    System.out.println("\nAll Employees:");
                    System.out.println("ID\tName\tDepartment\tSalary\tStatus");
                    for (int i = 0; i < n; i++) {
                        System.out.println(id[i] + "\t" + name[i] + "\t" +
                                dept[i] + "\t" + sal[i] + "\t" +
                                (stat[i] ? "Active" : "Resigned"));
                    }
                    break;

                case 2:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = in.nextInt();
                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (id[i] == searchId) {
                            System.out.println("\nEmployee Found:");
                            System.out.println("ID: " + id[i]);
                            System.out.println("Name: " + name[i]);
                            System.out.println("Department: " + dept[i]);
                            System.out.println("Salary: " + sal[i]);
                            System.out.println("Status: " + (stat[i] ? "Active" : "Resigned"));
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to mark resigned: ");
                    int rid = in.nextInt();
                    boolean updated = false;

                    for (int i = 0; i < n; i++) {
                        if (id[i] == rid) {
                            stat[i] = false;
                            System.out.println("Employee marked as resigned.");
                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Employee ID not found.");
                    }
                    break;

                case 4:
                    System.out.println("\nActive Employees:");
                    for (int i = 0; i < n; i++) {
                        if (stat[i]) {
                            System.out.println(id[i] + " - " + name[i] + " - " + dept[i]);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (ch!= 5);

        in.close();
    }
}
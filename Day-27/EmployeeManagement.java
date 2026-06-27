import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int empId;
    String name;
    String department;
    double salary;

    Employee(int empId, String name, String department, double salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + salary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = in.nextInt();
                    in.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = in.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = in.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = in.nextDouble();

                    employees.add(new Employee(id, name, dept, salary));
                    System.out.println("Employee added successfully.");
                    break;

                case 2:
                    if (employees.isEmpty()) {
                        System.out.println("No employee records found.");
                    } else {
                        for (Employee emp : employees) {
                            emp.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = in.nextInt();
                    boolean found = false;

                    for (Employee emp : employees) {
                        if (emp.empId == searchId) {
                            emp.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID to Update: ");
                    int updateId = in.nextInt();
                    in.nextLine();
                    boolean updated = false;

                    for (Employee emp : employees) {
                        if (emp.empId == updateId) {
                            System.out.print("Enter New Name: ");
                            emp.name = in.nextLine();

                            System.out.print("Enter New Department: ");
                            emp.department = in.nextLine();

                            System.out.print("Enter New Salary: ");
                            emp.salary = in.nextDouble();

                            System.out.println("Employee updated successfully.");
                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Employee ID to Delete: ");
                    int deleteId = in.nextInt();
                    boolean deleted = false;

                    for (int i = 0; i < employees.size(); i++) {
                        if (employees.get(i).empId == deleteId) {
                            employees.remove(i);
                            deleted = true;
                            System.out.println("Employee deleted successfully.");
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting Employee Management System...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 6);

        in.close();
    }
}
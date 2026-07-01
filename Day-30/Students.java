import java.util.Scanner;

public class Students{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = in.nextInt();
        in.nextLine(); // Consume newline

        String[] name = new String[n];
        String[] course = new String[n];
        int[] rollNo = new int[n];
        double[] m = new double[n];

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Roll No: ");
            rollNo[i] = in.nextInt();
            in.nextLine();

            System.out.print("Name: ");
            name[i] = in.nextLine();

            System.out.print("Course: ");
            course[i] = in.nextLine();

            System.out.print("Marks: ");
            m[i] = in.nextDouble();
        }

        // Display student records
        System.out.println("\n------ Student Records ------");
        System.out.printf("%-10s %-20s %-15s %-10s\n", "Roll No", "Name", "Course", "Marks");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-20s %-15s %-10.2f\n",
                    rollNo[i], name[i], course[i], m[i]);
        }

        in.close();
    }
}
import java.util.Scanner;

class Stu {
    int rollNo;
    String name;
    int eng, math, sci, sst, comp;
    int total;
    double percentage;
    char grade;

    Stu(int rollNo, String name, int eng, int math, int sci, int sst, int comp) {
        this.rollNo = rollNo;
        this.name = name;
        this.eng = eng;
        this.math = math;
        this.sci = sci;
        this.sst = sst;
        this.comp = comp;

        // Calculate total and percentage
        total = eng + math + sci + sst + comp;
        percentage = total / 5.0;

        // Decide grade
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 75) {
            grade = 'B';
        } else if (percentage >= 60) {
            grade = 'C';
        } else if (percentage >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    void printMarksheet() {
        System.out.println("\n========== MARKSHEET ==========");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);

        System.out.println("\nMarks:");
        System.out.println("English : " + eng);
        System.out.println("Maths   : " + math);
        System.out.println("Science : " + sci);
        System.out.println("Social  : " + sst);
        System.out.println("Computer: " + comp);

        System.out.println("------------------------------");
        System.out.println("Total      : " + total + " / 500");
        System.out.printf("Percentage : %.2f%%\n", percentage);
        System.out.println("Grade      : " + grade);

        if (grade == 'F') {
            System.out.println("Result     : Fail");
        } else {
            System.out.println("Result     : Pass");
        }

        System.out.println("==============================");
    }
}

public class Marksheet {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("===== Student Marksheet Generator =====");

        System.out.print("Enter Roll Number: ");
        int roll = in.nextInt();
        in.nextLine();

        System.out.print("Enter Student Name: ");
        String name = in.nextLine();

        System.out.print("English Marks: ");
        int eng = in.nextInt();

        System.out.print("Maths Marks: ");
        int math = in.nextInt();

        System.out.print("Science Marks: ");
        int sci = in.nextInt();

        System.out.print("Social Marks: ");
        int sst = in.nextInt();

        System.out.print("Computer Marks: ");
        int comp = in.nextInt();

        Stu student = new Stu(roll, name, eng, math, sci, sst, comp);

        student.printMarksheet();

        in.close();
    }
}
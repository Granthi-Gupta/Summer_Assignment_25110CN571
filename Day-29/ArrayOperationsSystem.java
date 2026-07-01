import java.util.Scanner;

public class ArrayOperationsSystem {

    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int ch;

        do {
            System.out.println("\nARRAY OPERATIONS MENU");
            System.out.println("1. Display Array");
            System.out.println("2. Find Maximum Element");
            System.out.println("3. Find Minimum Element");
            System.out.println("4. Calculate Sum");
            System.out.println("5. Calculate Average");
            System.out.println("6. Search an Element");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            ch = in.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Array Elements: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    int max = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] > max) {
                            max = arr[i];
                        }
                    }
                    System.out.println("Maximum Element = " + max);
                    break;

                case 3:
                    int min = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] < min) {
                            min = arr[i];
                        }
                    }
                    System.out.println("Minimum Element = " + min);
                    break;

                case 4:
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        sum += arr[i];
                    }
                    System.out.println("Sum = " + sum);
                    break;

                case 5:
                    sum = 0;
                    for (int i = 0; i < n; i++) {
                        sum += arr[i];
                    }
                    double average = (double) sum / n;
                    System.out.println("Average = " + average);
                    break;

                case 6:
                    System.out.print("Enter element to search: ");
                    int key = in.nextInt();
                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] == key) {
                            System.out.println("Element found at index " + i);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Element not found.");
                    }
                    break;

                case 7:
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (ch!= 7);

        in.close();
    }
}
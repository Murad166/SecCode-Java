import java.util.Scanner;

public class TwoDArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for 2D array size
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("Invalid array size. Rows and columns must be positive integers.");
            scanner.close();
            return;
        }

        int[][] array = new int[rows][cols];

        // Taking user input for array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        // Printing the 2D array
        System.out.println("The 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // Calculating sum of all elements
        int sum = 0;
        int max = array[0][0], min = array[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += array[i][j];
                if (array[i][j] > max) {
                    max = array[i][j];
                }
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }

        System.out.println("Sum of all elements: " + sum);
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

        scanner.close();
    }
}

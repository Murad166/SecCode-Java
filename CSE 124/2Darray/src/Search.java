import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the dimensions of the matrix
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Initializing the 2D array
        int[][] matrix = new int[rows][cols];

        // Taking elements of the matrix as input
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Taking the number to search for
        System.out.print("Enter the number to search for: ");
        int target = scanner.nextInt();

        // Searching for the number in the 2D array
        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("The number " + target + " is found at position (" + i + ", " + j + ").");
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("The number " + target + " is not found in the matrix.");
        }

        scanner.close();
    }
}

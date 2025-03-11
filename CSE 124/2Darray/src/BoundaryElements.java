import java.util.Scanner;

public class BoundaryElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the dimensions of the matrix
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Initializing the matrix
        int[][] matrix = new int[rows][cols];

        // Taking elements of the matrix as input
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Printing the boundary elements of the matrix
        System.out.println("The boundary elements of the matrix are:");
        
        // Print top row
        for (int j = 0; j < cols; j++) {
            System.out.print(matrix[0][j] + " ");
        }

        // Print right column (excluding the first and last element already printed)
        for (int i = 1; i < rows; i++) {
            System.out.print(matrix[i][cols - 1] + " ");
        }

        // Print bottom row (excluding the last element already printed)
        if (rows > 1) {  // To avoid duplicate print when there's only one row
            for (int j = cols - 2; j >= 0; j--) {
                System.out.print(matrix[rows - 1][j] + " ");
            }
        }

        // Print left column (excluding the first and last element already printed)
        if (cols > 1) {  // To avoid duplicate print when there's only one column
            for (int i = rows - 2; i > 0; i--) {
                System.out.print(matrix[i][0] + " ");
            }
        }

        System.out.println();  // For a clean line at the end

        scanner.close();
    }
}

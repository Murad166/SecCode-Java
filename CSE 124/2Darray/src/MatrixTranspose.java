import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking matrix dimensions from user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        int[][] transpose = new int[cols][rows]; // Transposed matrix

        // Taking user input for matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Finding the transpose
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j]; // Swap rows and columns
            }
        }

        // Printing the original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix, rows, cols);

        // Printing the transposed matrix
        System.out.println("Transpose of the Matrix:");
        printMatrix(transpose, cols, rows); // Pass swapped dimensions

        scanner.close();
    }

    // Helper method to print a matrix
    public static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the size of the square matrix
        System.out.print("Enter the size of the square matrix (n x n): ");
        int n = scanner.nextInt();

        // Initializing the square matrix
        int[][] matrix = new int[n][n];

        // Taking elements of the matrix as input
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculating the sum of the main diagonal and secondary diagonal
        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            mainDiagonalSum += matrix[i][i];  // Main diagonal: matrix[i][i]
            secondaryDiagonalSum += matrix[i][n - i - 1];  // Secondary diagonal: matrix[i][n-i-1]
        }

        // Printing the results
        System.out.println("Sum of the main diagonal: " + mainDiagonalSum);
        System.out.println("Sum of the secondary diagonal: " + secondaryDiagonalSum);

        scanner.close();
    }
}


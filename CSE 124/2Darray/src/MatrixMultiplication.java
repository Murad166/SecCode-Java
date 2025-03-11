import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking matrix dimensions as input
        System.out.print("Enter the number of rows for the first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix (and rows for second matrix): ");
        int cols1 = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int cols2 = scanner.nextInt();

        // Initialize the matrices and result matrix
        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[cols1][cols2];
        int[][] result = new int[rows1][cols2];

        // Taking elements of the first matrix as input
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print("Enter element [" + i + "][" + j + "] of the first matrix: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Taking elements of the second matrix as input
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < cols1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print("Enter element [" + i + "][" + j + "] of the second matrix: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Matrix multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Displaying the result matrix
        System.out.println("The result of matrix multiplication is:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

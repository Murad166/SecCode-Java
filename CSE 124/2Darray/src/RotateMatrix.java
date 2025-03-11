import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the size of the square matrix
        System.out.print("Enter the size of the square matrix (n x n): ");
        int n = scanner.nextInt();

        // Initialize the square matrix
        int[][] matrix = new int[n][n];

        // Taking elements of the matrix as input
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Rotating the matrix by 90 degrees clockwise
        rotateMatrix(matrix, n);

        // Displaying the rotated matrix
        System.out.println("The matrix after rotating by 90 degrees clockwise is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    // Function to rotate the matrix by 90 degrees clockwise
    public static void rotateMatrix(int[][] matrix, int n) {
        // First, transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Swap matrix[i][j] with matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Then, reverse each row to complete the 90-degree rotation
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                // Swap elements at the left and right ends of each row
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}
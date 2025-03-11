import java.util.Scanner;

public class ZigzagTraversal {
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

        // Traversing the matrix in a zigzag pattern
        System.out.println("Zigzag traversal of the matrix:");

        // Traverse the matrix in a zigzag pattern
        for (int j = 0; j < cols; j++) {
            // If the column index is even, traverse from top to bottom
            if (j % 2 == 0) {
                for (int i = 0; i < rows; i++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } 
            // If the column index is odd, traverse from bottom to top
            else {
                for (int i = rows - 1; i >= 0; i--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }

        System.out.println();  // For a clean line at the end
        scanner.close();
    }
}

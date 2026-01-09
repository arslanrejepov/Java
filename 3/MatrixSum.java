import java.util.Scanner;

public class MatrixSum {

    // Method to sum all integers in the matrix
    public static double sumMatrix(int[][] m) {
        double sum = 0;
        // Iterate over the matrix and sum all the elements
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sum += m[i][j];
            }
        }
        return sum; // Return the sum of all elements
    }

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Declare a 4x4 matrix
        int[][] matrix = new int[4][4];

        // Prompt the user to enter the matrix row by row
        System.out.println("Enter a 4-by-4 matrix (row by row):");

        // Read the 4-by-4 matrix from the user
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Call the sumMatrix method to get the sum of the elements
        double sum = sumMatrix(matrix);

        // Display the sum of the matrix elements
        System.out.println("The sum of all the elements in the matrix is: " + sum);

        // Close the scanner
        scanner.close();
    }
}

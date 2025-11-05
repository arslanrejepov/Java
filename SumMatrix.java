import java.util.Scanner;

public class SumMatrix {

    // Method to sum all integers in a matrix
    public static double sumMatrix(int[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sum += m[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[4][4];

        System.out.println("Enter a 4-by-4 matrix (row by row):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        double total = sumMatrix(matrix);
        System.out.println("The sum of the matrix is " + total + ".");
    }
}

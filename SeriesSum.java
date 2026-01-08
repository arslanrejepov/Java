import java.util.InputMismatchException;
import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a digit (0-9): ");
            int a = sc.nextInt();

            System.out.print("Enter how many numbers to add: ");
            int n = sc.nextInt();

            if (a < 0 || a > 9) {
                throw new IllegalArgumentException("Digit must be between 0 and 9.");
            }
            if (n <= 0) {
                throw new IllegalArgumentException("Count must be a positive integer.");
            }

            long sum = 0;
            long term = 0;

            for (int i = 1; i <= n; i++) {
                term = term * 10 + a;   // builds: a, aa, aaa, ...
                sum += term;
            }

            System.out.println("Sum = " + sum);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input: please enter integers only.");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter values for a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Create an instance of QuadraticEquation with the entered coefficients
        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        // Calculate the discriminant
        double discriminant = equation.getDiscriminant();

        // Display the discriminant
        System.out.println("Discriminant: " + discriminant);

        // Check if the discriminant is non-negative
        if (discriminant > 0) {
            // Display both roots if discriminant is positive
            System.out.println("The equation has two roots:");
            System.out.println("Root 1: " + equation.getRoot1());
            System.out.println("Root 2: " + equation.getRoot2());
        } else if (discriminant == 0) {
            // Display the one root if discriminant is 0
            System.out.println("The equation has one root:");
            System.out.println("Root 1: " + equation.getRoot1());
        } else {
            // Display the message when there are no real roots
            System.out.println("The equation has no roots.");
        }

        // Close the scanner
        scanner.close();
    }
}

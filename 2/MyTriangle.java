import java.util.Scanner;

public class MyTriangle {

    // Method to check if the sides form a valid triangle
    public static boolean isValid(double side1, double side2, double side3) {
        // A triangle is valid if the sum of any two sides is greater than the third side
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }

    // Method to compute the area of the triangle
    public static double area(double side1, double side2, double side3) {
        // Using Heron's formula to calculate the area
        double s = (side1 + side2 + side3) / 2;  // Semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the three sides of the triangle
        System.out.print("Enter side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side 3: ");
        double side3 = scanner.nextDouble();

        // Check if the triangle is valid
        if (isValid(side1, side2, side3)) {
            // If valid, compute and print the area
            double area = area(side1, side2, side3);
            System.out.printf("The area of the triangle is: %.2f%n", area);
        } else {
            // If not valid, display an error message
            System.out.println("The input is invalid.");
        }

        // Close the scanner
        scanner.close();
    }
}

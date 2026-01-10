import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Test default constructor (Rectangle with 10.0x10.0)
        Rectangle rect1 = new Rectangle();
        System.out.println("Rectangle 1 (Default constructor):");
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());
        System.out.println("Drawing rectangle 1:");
        rect1.drawRect();

        // Close the scanner
        scanner.close();
    }
}

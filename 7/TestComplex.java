import java.util.Scanner;

public class TestComplex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for two complex numbers
        System.out.print("Enter the first complex number (real and imaginary): ");
        Complex complex1 = new Complex(scanner.nextDouble(), scanner.nextDouble());

        System.out.print("Enter the second complex number (real and imaginary): ");
        Complex complex2 = new Complex(scanner.nextDouble(), scanner.nextDouble());

        // Perform operations
        Complex sum = complex1.add(complex2);
        Complex difference = complex1.subtract(complex2);
        Complex product = complex1.multiply(complex2);
        Complex quotient = complex1.divide(complex2);

        System.out.println(complex1 + " + " + complex2 + " = " + sum);
        System.out.println(complex1 + " - " + complex2 + " = " + difference);
        System.out.println(complex1 + " * " + complex2 + " = " + product);
        System.out.println(complex1 + " / " + complex2 + " = " + quotient);
        System.out.println("|" + complex1 + "| = " + complex1.abs());
    }
}

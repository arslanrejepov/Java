public class QuadraticEquation {
    // Private fields for the coefficients a, b, and c
    private double a;
    private double b;
    private double c;

    // Constructor to initialize a, b, and c
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getter method for a
    public double getA() {
        return a;
    }

    // Getter method for b
    public double getB() {
        return b;
    }

    // Getter method for c
    public double getC() {
        return c;
    }

    // Method to calculate the discriminant: b^2 - 4ac
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    // Method to calculate the first root (if the discriminant is non-negative)
    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0) {
            return (-b + Math.sqrt(discriminant)) / (2 * a);
        }
        return 0; // Return 0 if no real root exists
    }

    // Method to calculate the second root (if the discriminant is non-negative)
    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0) {
            return (-b - Math.sqrt(discriminant)) / (2 * a);
        }
        return 0; // Return 0 if no real root exists
    }
}

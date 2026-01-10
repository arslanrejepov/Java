public class Circle2D {
    private double x;
    private double y;
    private double radius;

    // No-arg constructor (default circle)
    public Circle2D() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    // Constructor with x, y, and radius
    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Getter methods for x, y, and radius
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    // Method to compute the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to compute the perimeter (circumference) of the circle
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Method to check if a point is inside the circle
    public boolean contains(double x, double y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y)) <= radius;
    }

    // Method to check if another circle is inside this circle
    public boolean contains(Circle2D circle) {
        return Math.sqrt((circle.x - this.x) * (circle.x - this.x) + (circle.y - this.y) * (circle.y - this.y)) + circle.radius <= this.radius;
    }

    // Method to check if another circle overlaps with this circle
    public boolean overlaps(Circle2D circle) {
        double distance = Math.sqrt((circle.x - this.x) * (circle.x - this.x) + (circle.y - this.y) * (circle.y - this.y));
        return distance < this.radius + circle.radius;
    }
}

public class TestCircle2D {
    public static void main(String[] args) {
        // Create a Circle2D object c1
        Circle2D c1 = new Circle2D(2, 2, 5.5);

        // Display area and perimeter
        System.out.println("Area of c1: " + c1.getArea());
        System.out.println("Perimeter of c1: " + c1.getPerimeter());

        // Test contains methods
        System.out.println("Does c1 contain the point (3, 3)? " + c1.contains(3, 3));
        System.out.println("Does c1 contain the circle (4, 5, 10.5)? " + c1.contains(new Circle2D(4, 5, 10.5)));

        // Test overlaps method
        System.out.println("Does c1 overlap with (3, 5, 2.3)? " + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}

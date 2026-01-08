
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("Default Rectangle:");
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        r1.drawRect();

        System.out.println("\nCustom Rectangle:");
        Rectangle r2 = new Rectangle(20, 15);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());
        r2.drawRect();

        System.out.println("\nInvalid Rectangle:");
        Rectangle r3 = new Rectangle(-5, 100);
        System.out.println("Area: " + r3.getArea());
        System.out.println("Perimeter: " + r3.getPerimeter());
        r3.drawRect();
    }
}

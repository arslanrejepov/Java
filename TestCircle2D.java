public class TestCircle2D {
    public static void main(String[] args) {

        Circle2D c1 = new Circle2D(2, 2, 5.5);
    
        System.out.println("Circle c1:");
        System.out.println("  Center: (" + c1.getX() + ", " + c1.getY() + ")");
        System.out.println("  Radius: " + c1.getRadius());
        
        System.out.println("\nArea of c1: " + c1.getArea());
        System.out.println("Perimeter of c1: " + c1.getPerimeter());

        System.out.println("Does c1 contain point (3, 3)? " + c1.contains(3, 3));
        
        Circle2D c2 = new Circle2D(4, 5, 10.5);
        System.out.println("Circle c2: center (" + c2.getX() + ", " + c2.getY() + "), radius " + c2.getRadius());
        System.out.println("Does c1 contain c2? " + c1.contains(c2));

        Circle2D c3 = new Circle2D(3, 5, 2.3);
        System.out.println("Circle c3: center (" + c3.getX() + ", " + c3.getY() +  "), radius " + c3.getRadius());
        System.out.println("Does c1 overlap with c3? " + c1.overlaps(c3));
        
 
        Circle2D c4 = new Circle2D();
        System.out.println("Default circle c4: center (" + c4.getX() + ", " + c4.getY() +  "), radius " + c4.getRadius());
        System.out.println("Area of c4: " + c4.getArea());
        System.out.println("Perimeter of c4: " + c4.getPerimeter());

        System.out.println("\nDoes c1 contain point (0, 0)? " + c1.contains(0, 0));
        System.out.println("Does c1 contain point (2, 2)? " + c1.contains(2, 2));

        Circle2D c5 = new Circle2D(2, 2, 2);
        System.out.println("\nCircle c5: center (" + c5.getX() + ", " + c5.getY() + 
                         "), radius " + c5.getRadius());
        System.out.println("Does c1 contain c5? " + c1.contains(c5));
        System.out.println("Does c1 overlap with c5? " + c1.overlaps(c5));
    }
}
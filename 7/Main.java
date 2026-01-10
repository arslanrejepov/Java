public class Main {
    public static void main(String[] args) {
        // Set the radius
        double radius = 3.5;

        // Create objects of MyCircle and MySphere
        MyCircle circle = new MyCircle();
        MySphere sphere = new MySphere();

        // Display results for MyCircle
        System.out.println("MyCircle (Radius = " + radius + ")");
        System.out.println("Area: " + circle.area(radius));
        System.out.println("Volume: " + circle.volume(radius));

        // Display results for MySphere
        System.out.println("\nMySphere (Radius = " + radius + ")");
        System.out.println("Area: " + sphere.area(radius));
        System.out.println("Volume: " + sphere.volume(radius));
    }
}

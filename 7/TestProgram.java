public class TestProgram {
    public static void main(String[] args) {
        GeometricObject[] objects = {
            new Square(4, "Red"),
            new Square(5, "Blue")
        };

        for (GeometricObject obj : objects) {
            System.out.println("Area: " + obj.getArea());
            if (obj instanceof Colorable) {
                ((Colorable) obj).howToColor();
            }
        }
    }
}

public class MyCircle implements VolumeArea {

    @Override
    public double volume(double radius) {
        // The volume of a circle is always 0 as it is a 2D shape
        return 0;
    }

    @Override
    public double area(double radius) {
        // Area of a circle = π * r^2
        return PI * radius * radius;
    }
}

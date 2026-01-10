public class MySphere implements VolumeArea {

    @Override
    public double volume(double radius) {
        // Volume of a sphere = (4/3) * π * r^3
        return (4 * PI * radius * radius * radius) / 3;
    }

    @Override
    public double area(double radius) {
        // Surface area of a sphere = 4 * π * r^2
        return 4 * PI * radius * radius;
    }
}

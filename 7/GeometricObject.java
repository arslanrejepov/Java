public abstract class GeometricObject {
    private String color;

    public GeometricObject(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();
}

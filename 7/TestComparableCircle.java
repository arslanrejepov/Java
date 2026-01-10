public class TestComparableCircle {
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(5);
        ComparableCircle circle2 = new ComparableCircle(7);

        if (circle1.compareTo(circle2) > 0) {
            System.out.println("Circle 1 is larger.");
        } else if (circle1.compareTo(circle2) < 0) {
            System.out.println("Circle 2 is larger.");
        } else {
            System.out.println("Both circles are the same size.");
        }
    }
}

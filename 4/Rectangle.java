public class Rectangle {
    // Fields
    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        this.length = 10.0;
        this.width = 10.0;
    }

    // Constructor with parameters
    public Rectangle(double len, double wid) {
        // Check if the given values are greater than 0
        if (len > 0 && wid > 0) {
            this.length = len;
            this.width = wid;
        } else {
            this.length = 10.0;
            this.width = 10.0;
        }
    }

    // Method to get the area of the rectangle
    public double getArea() {
        if (length >= 10 && length <= 50 && width >= 10 && width <= 50) {
            return length * width;
        }
        return -1; // Return -1 if length and width are not within the valid range
    }

    // Method to get the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Method to draw the rectangle using asterisk (*)
    public void drawRect() {
        int intLength = (int) length;
        int intWidth = (int) width;

        // If length and width are within the valid range, use those values for drawing
        if (intLength >= 10 && intLength <= 50 && intWidth >= 10 && intWidth <= 50) {
            for (int i = 0; i < intWidth; i++) {
                for (int j = 0; j < intLength; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            // Draw a default 10x10 rectangle if the dimensions are out of range
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}

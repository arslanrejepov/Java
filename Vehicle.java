public class Vehicle {
    private int speed;
    private char size;
    private String brand, colour;

    public Vehicle(String b, char s, String c, int sp) {
        speed = sp;
        brand = b;
        colour = c;
        size = s;
    }

    public void move() {
        System.out.println("The vehicle is running with speed " + speed);
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void speedup() {
        speed += 5;
    }

    public void speedDown() {
        speed -= 5;
    }

    public int getSpeed() {
        return speed;
    }
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Mercedes", 'L', "Black", 80);
        v1.move();
        v1.speedup();
        v1.move();
        v1.speedDown();
        v1.move();
        v1.setSpeed(100);
        v1.move();
        System.out.println("Current speed: " + v1.getSpeed());
    }
}

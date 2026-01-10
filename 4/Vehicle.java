public class Vehicle {
    // Properties of the vehicle
    private int speed;
    private String size;
    private String brand;

    // Constructor to initialize the properties
    public Vehicle(int speed, String size, String brand) {
        this.speed = speed;
        this.size = size;
        this.brand = brand;
    }

    // Method to simulate the vehicle moving with the current speed
    public void move() {
        System.out.println("The vehicle is running with speed " + speed + " km/h.");
    }

    // Method to reset the speed to a specific value
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Method to increase the speed by 5 km/h
    public void speedUp() {
        this.speed += 5;
        System.out.println("The speed has increased to " + speed + " km/h.");
    }

    // Method to decrease the speed by 5 km/h
    public void speedDown() {
        this.speed -= 5;
        System.out.println("The speed has decreased to " + speed + " km/h.");
    }

    // Method to get the current speed
    public int getSpeed() {
        return speed;
    }

    // Method to display vehicle information
    public void displayInfo() {
        System.out.println("Vehicle brand: " + brand);
        System.out.println("Vehicle size: " + size);
        System.out.println("Current speed: " + speed + " km/h");
    }

    // Main method to test the Vehicle class
    public static void main(String[] args) {
        // Create an instance of Vehicle with initial values
        Vehicle myVehicle = new Vehicle(50, "Sedan", "Toyota");

        // Display vehicle information
        myVehicle.displayInfo();

        // Move the vehicle and display the current speed
        myVehicle.move();

        // Change the speed using the speedUp and speedDown methods
        myVehicle.speedUp();   // Increase speed by 5
        myVehicle.speedDown(); // Decrease speed by 5

        // Reset speed using setSpeed
        myVehicle.setSpeed(80);
        System.out.println("After resetting the speed:");
        myVehicle.move();  // Display the updated speed
    }
}

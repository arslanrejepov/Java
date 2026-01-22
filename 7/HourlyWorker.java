class HourlyWorker extends Employee {
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public HourlyWorker(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double getPaid() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void display() {
        System.out.println("Hourly Worker: " + name + ", Salary: " + getPaid());
    }
}
    
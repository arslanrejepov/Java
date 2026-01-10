class Boss extends Employee {
    private String name;
    private double salary;

    public Boss(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getPaid() {
        return salary;
    }

    @Override
    public void display() {
        System.out.println("Boss: " + name + ", Salary: " + salary);
    }
}

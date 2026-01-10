class CommissionWork extends Employee {
    private String name;
    private double baseSalary;
    private double commission;

    public CommissionWork(String name, double baseSalary, double commission) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.commission = commission;
    }

    @Override
    public double getPaid() {
        return baseSalary + commission;
    }

    @Override
    public void display() {
        System.out.println("Commission Worker: " + name + ", Salary: " + getPaid());
    }
}

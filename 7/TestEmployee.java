public class TestEmployee {
    public static void main(String[] args) {
        // Creating instances of different types of employees
        Employee boss = new Boss("Alice", 5000);
        Employee commissionWorker = new CommissionWork("Bob", 3000, 1500);
        Employee pieceWorker = new PieceWorker("Charlie", 10, 200);
        Employee hourlyWorker = new HourlyWorker("David", 20, 160);

        // Display details and payment
        boss.display();
        commissionWorker.display();
        pieceWorker.display();
        hourlyWorker.display();
    }
}

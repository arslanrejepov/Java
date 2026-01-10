class PieceWorker extends Employee {
    private String name;
    private double payPerPiece;
    private int numberOfPieces;

    public PieceWorker(String name, double payPerPiece, int numberOfPieces) {
        this.name = name;
        this.payPerPiece = payPerPiece;
        this.numberOfPieces = numberOfPieces;
    }

    @Override
    public double getPaid() {
        return payPerPiece * numberOfPieces;
    }

    @Override
    public void display() {
        System.out.println("Piece Worker: " + name + ", Salary: " + getPaid());
    }
}

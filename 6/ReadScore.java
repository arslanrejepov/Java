import java.util.Scanner;

class ReadScore {
    private Scanner input;

    public ReadScore() {
        input = new Scanner(System.in);
    }

    public double[] readInput() {
        System.out.print("Enter the number of the scores: ");
        int size = input.nextInt();
        double[] score = new double[size];
        System.out.println("Enter the scores: ");
        for (int i = 0; i < size; i++) {
            score[i] = input.nextDouble();
        }
        return score;
    }
}

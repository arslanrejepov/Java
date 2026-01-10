import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        ReadScore reader = new ReadScore();
        double[] scores = reader.readInput();

        EstimateScore estimator = new EstimateScore(scores);
        estimator.calculatePassNumber();
        estimator.calculateMax();
        estimator.calculateMean();
        estimator.displayResults();
    }
}

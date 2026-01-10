class EstimateScore {
    private int numberPass;
    private double max, mean;
    private double[] score;

    public EstimateScore(double[] score) {
        this.score = score;
        this.numberPass = 0;
        this.max = score[0];
        this.mean = 0;
    }

    public void calculatePassNumber() {
        for (double s : score) {
            if (s >= 60) {
                numberPass++;
            }
        }
    }

    public void calculateMax() {
        for (double s : score) {
            if (s > max) {
                max = s;
            }
        }
    }

    public void calculateMean() {
        double sum = 0;
        for (double s : score) {
            sum += s;
        }
        mean = sum / score.length;
    }

    public void displayResults() {
        System.out.println("There're " + numberPass + " scores that are not less than 60");
        System.out.println("The maximum score is " + max);
        System.out.println("The mean value is " + mean);
    }
}

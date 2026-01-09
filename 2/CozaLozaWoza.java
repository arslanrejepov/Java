public class CozaLozaWoza {
    public static void main(String[] args) {
        int count = 0;

        // Loop through numbers from 1 to 110
        for (int i = 1; i <= 110; i++) {
            // Check the divisibility conditions
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.print("CozaLozaWoza ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("CozaLoza ");
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.print("CozaWoza ");
            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.print("LozaWoza ");
            } else if (i % 3 == 0) {
                System.out.print("Coza ");
            } else if (i % 5 == 0) {
                System.out.print("Loza ");
            } else if (i % 7 == 0) {
                System.out.print("Woza ");
            } else {
                System.out.print(i + " ");
            }

            // Print a new line after every 11 numbers
            count++;
            if (count == 11) {
                System.out.println();
                count = 0;
            }
        }
    }
}

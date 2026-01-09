import java.util.Scanner;

public class CozaLozaWozaNew {

    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the range of numbers
        System.out.print("Please input the range of the numbers:\nFrom (>=0): ");
        int startNum = scanner.nextInt(); // Starting number
        System.out.print("To: ");
        int endNum = scanner.nextInt(); // Ending number

        // Print the output heading
        System.out.println("The output of CozaLozaWoza is:");

        // Invoke the method for printing numbers in the given range
        printNum(startNum, endNum);

        // Close the scanner
        scanner.close();
    }

    // Method to print the numbers in the specified range with conditions
    public static void printNum(int startNum, int endNum) {
        int count = 0;

        // Loop through the range from startNum to endNum
        for (int i = startNum; i <= endNum; i++) {
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

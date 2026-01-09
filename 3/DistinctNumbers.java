import java.util.Scanner;

public class DistinctNumbers {

    // Method to collect the unique numbers from the input array
    public static int[] collectUnique(int[] raw) {
        // Create an array to hold the distinct numbers (with maximum possible size 10)
        int[] temp = new int[raw.length];
        int count = 0;

        // Iterate through the raw array to collect distinct numbers
        for (int i = 0; i < raw.length; i++) {
            boolean isDuplicate = false;
            // Check if the number is already in the temp array
            for (int j = 0; j < count; j++) {
                if (raw[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            // If not a duplicate, add to the temp array
            if (!isDuplicate) {
                temp[count++] = raw[i];
            }
        }

        // Create an array with the exact size of distinct elements
        int[] distinctNumbers = new int[count];
        System.arraycopy(temp, 0, distinctNumbers, 0, count);

        return distinctNumbers; // Return the array with distinct numbers
    }

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Declare an array to hold the 10 integers
        int[] numbers = new int[10];

        // Prompt the user to enter 10 numbers
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Get the distinct numbers using the collectUnique method
        int[] distinctNumbers = collectUnique(numbers);

        // Display the number of distinct numbers and the distinct numbers themselves
        System.out.println("The number of distinct numbers is " + distinctNumbers.length);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < distinctNumbers.length; i++) {
            System.out.print(distinctNumbers[i] + " ");
        }
        System.out.println();

        // Close the scanner
        scanner.close();
    }
}

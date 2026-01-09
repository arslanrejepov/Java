import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        // Declare the exchange rate for EGP (Egyptian Pounds) per AUD
        double exchangeRate = 13.5367;

        // Declare variables for AUD and EGP amounts
        double audAmount, egpAmount;

        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the amount in Australian Dollars
        System.out.print("Enter the amount in Australian Dollars (AUD): ");
        audAmount = scanner.nextDouble();

        // Calculate the equivalent amount in Egyptian Pounds
        egpAmount = audAmount * exchangeRate;

        // Display the result
        System.out.printf("%.2f AUD is equivalent to %.2f EGP.%n", audAmount, egpAmount);

        // Close the scanner
        scanner.close();
    }
}

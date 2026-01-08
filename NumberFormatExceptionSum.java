import java.util.Scanner;

public class NumberFormatExceptionSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter two integers: ");
            String line = input.nextLine();

            try {
                String[] parts = line.trim().split("\\s+");
                if (parts.length != 2) {
                    throw new NumberFormatException("Please enter exactly two integers.");
                }

                int a = Integer.parseInt(parts[0]);
                int b = Integer.parseInt(parts[1]);

                System.out.println("Sum = " + (a + b));
                break; // valid input -> stop looping
            } catch (NumberFormatException e) {
                System.out.println("Incorrect input. Please try again.");
            }
        }

        input.close();
    }
}

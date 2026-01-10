import java.util.Scanner;

public class PhoneKeyPad {

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Prompt the user for a string input (case insensitive)
        System.out.print("Enter a string: ");
        String str = input.next().toLowerCase(); // Convert input to lowercase to handle case insensitivity

        // Iterate through each character of the string and map to corresponding digit
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Use a switch-case to map each character to a digit
            switch (ch) {
                case 'a': case 'b': case 'c':
                    result.append(2);
                    break;
                case 'd': case 'e': case 'f':
                    result.append(3);
                    break;
                case 'g': case 'h': case 'i':
                    result.append(4);
                    break;
                case 'j': case 'k': case 'l':
                    result.append(5);
                    break;
                case 'm': case 'n': case 'o':
                    result.append(6);
                    break;
                case 'p': case 'q': case 'r': case 's':
                    result.append(7);
                    break;
                case 't': case 'u': case 'v':
                    result.append(8);
                    break;
                case 'w': case 'x': case 'y': case 'z':
                    result.append(9);
                    break;
                default:
                    // If the character is not a letter, we ignore it (you can handle other cases if needed)
                    break;
            }
        }

        // Output the resulting digit sequence
        System.out.println("Converted sequence of digits: " + result.toString());

        // Close the scanner
        input.close();
    }
}

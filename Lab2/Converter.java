import java.util.Scanner;

public class Converter {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        char ch;
        char choice;
        
        do {
            System.out.print("Enter a character: ");
            ch = sc.next().charAt(0);

            if (!Character.isLetter(ch)) {
                System.out.println("Wrong input!");
            } else {
                char converted;
                if (Character.isLowerCase(ch)) {
                    converted = Character.toUpperCase(ch);
                } else {
                    converted = Character.toLowerCase(ch);
                }
                System.out.println("Original: " + ch);
                System.out.println("Converted: " + converted);
            }

            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        System.out.println("Program Exited:");
        sc.close();

        }
}

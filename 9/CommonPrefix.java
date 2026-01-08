import java.util.Scanner;

public class CommonPrefix {
    public static String prefix(String s1, String s2) {
        StringBuilder result = new StringBuilder();

        int length = Math.min(s1.length(), s2.length());

        for (int i = 0; i < length; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                result.append(s1.charAt(i));
            } else {
                break; 
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String s2 = input.nextLine();

        String common = prefix(s1, s2);

        if (common.isEmpty()) {
            System.out.println("No common prefix.");
        } else {
            System.out.println("The common prefix is: " + common);
        }
    }
}

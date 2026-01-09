import java.util.Scanner;

public class NewArrayEquality {

    // Method to check if two arrays have the same contents
    public static boolean equal(int[] list1, int[] list2) {
        // Check if the arrays have the same length
        if (list1.length != list2.length) {
            return false;
        }

        // Compare each element of the arrays
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false; // If any element is different, return false
            }
        }

        return true; // Return true if all elements match
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first list
        System.out.print("Enter list1: ");
        int n1 = scanner.nextInt(); // Number of elements in list1
        int[] list1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            list1[i] = scanner.nextInt();
        }

        // Prompt the user to enter the second list
        System.out.print("Enter list2: ");
        int n2 = scanner.nextInt(); // Number of elements in list2
        int[] list2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            list2[i] = scanner.nextInt();
        }

        // Check if the two lists are identical and display the result
        if (equal(list1, list2)) {
            System.out.println("Two lists are identical");
        } else {
            System.out.println("Two lists are not identical");
        }

        // Close the scanner
        scanner.close();
    }
}

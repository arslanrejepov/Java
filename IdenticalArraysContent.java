import java.util.Arrays;
import java.util.Scanner;

public class IdenticalArraysContent {

    public static boolean equal(int[] list1, int[] list2) {
        if (list1.length != list2.length)
            return false;

        // Sort both arrays so order doesn’t matter
        Arrays.sort(list1);
        Arrays.sort(list2);

        // Compare element by element
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read first list
        System.out.print("Enter list1: ");
        int size1 = input.nextInt();
        int[] list1 = new int[size1];
        for (int i = 0; i < size1; i++)
            list1[i] = input.nextInt();

        // Read second list
        System.out.print("Enter list2: ");
        int size2 = input.nextInt();
        int[] list2 = new int[size2];
        for (int i = 0; i < size2; i++)
            list2[i] = input.nextInt();

        // Display result
        if (equal(list1, list2))
            System.out.println("Two lists are identical");
        else
            System.out.println("Two lists are not identical");
    }
}

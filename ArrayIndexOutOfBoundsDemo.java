import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[100];

        // Fill array with random integers
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(); // any int value
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index (0 - 99): ");
        int index = input.nextInt();

        try {
            System.out.println("Element at index " + index + " is: " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }

        input.close();
    }
}

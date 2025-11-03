import java.util.Scanner;

public class DistinctNumbers {

    // Method to collect unique numbers from raw array
    public static int[] collectUnique(int[] raw) {
        int[] unique = new int[raw.length];  // max possible size
        int count = 0;

        for (int i = 0; i < raw.length; i++) {
            boolean found = false;
            // check if raw[i] is already in unique[]
            for (int j = 0; j < count; j++) {
                if (raw[i] == unique[j]) {
                    found = true;
                    break;
                }
            }
            // if not found, add it
            if (!found) {
                unique[count] = raw[i];
                count++;
            }
        }

        // create a new array with exact size
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = unique[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        int[] distinct = collectUnique(numbers);

        System.out.println("The number of distinct numbers is " + distinct.length);
        System.out.print("The distinct numbers are: ");
        for (int n : distinct) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

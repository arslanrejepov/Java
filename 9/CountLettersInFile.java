import java.io.*;
import java.util.Scanner;

public class CountLettersInFile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a filename: ");
        String filename = input.nextLine();

        int[] counts = new int[26];   // A-Z counts

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            int ch;

            while ((ch = reader.read()) != -1) {
                char c = Character.toLowerCase((char) ch);

                if (c >= 'a' && c <= 'z') {
                    counts[c - 'a']++;  // Map 'a'→0, 'b'→1, ...
                }
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("File not found or cannot be read.");
            return;
        }
        for (int i = 0; i < counts.length; i++) {
            char letter = (char) ('A' + i);
            System.out.println(letter + ": " + counts[i]);
        }
    }
}

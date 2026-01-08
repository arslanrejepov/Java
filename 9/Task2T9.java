import java.io.*;

public class Task2T9 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Task2T9 stringToRemove filename");
            System.exit(1);
        }

        String remove = args[0];
        String filename = args[1];

        File file = new File(filename);

        File tempFile = new File("temp.txt");

        try (
            BufferedReader reader = new BufferedReader(new FileReader(file));
            PrintWriter writer = new PrintWriter(new FileWriter(tempFile));
        ) {
            String line;

            while ((line = reader.readLine()) != null) {
                line = line.replace(remove, "");
                writer.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }
        file.delete();
        tempFile.renameTo(file);

        System.out.println("All occurrences of \"" + remove + "\" have been removed.");
    }
}

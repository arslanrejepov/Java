import java.io.*;

public class ReplaceText {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Usage: java ReplaceText sourceFile targetFile oldString newString");
            System.exit(1);
        }

        String sourceFile = args[0];
        String targetFile = args[1];
        String oldString = args[2];
        String newString = args[3];

        try (
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            PrintWriter writer = new PrintWriter(new FileWriter(targetFile));
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replace(oldString, newString);
                writer.println(line);
            }

            System.out.println("Replacement completed. Output saved in: " + targetFile);

        } catch (IOException e) {
            System.out.println("Error processing files: " + e.getMessage());
        }
    }
}

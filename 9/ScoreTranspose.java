import java.io.*;
import java.util.*;

public class ScoreTranspose {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new FileReader("scores.txt"));

        String header = reader.readLine();
        String[] titles = header.split("\\s+");
        
        int courseCount = titles.length - 1;
        List<String> names = new ArrayList<>();
        double[][] scores = new double[4][courseCount];

        String line;
        int row = 0;

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("\\s+");
            names.add(parts[0]);
            for (int i = 1; i < parts.length; i++) {
                scores[row][i - 1] = Double.parseDouble(parts[i]);
            }
            row++;
        }

        reader.close();

        PrintWriter writer = new PrintWriter(new FileWriter("courses.txt"));

        writer.print("COURSEs");
        for (String name : names) {
            writer.print(" " + name);
        }
        writer.println();

        for (int c = 0; c < courseCount; c++) {
            writer.print(titles[c + 1]);
            for (int r = 0; r < names.size(); r++) {
                writer.print(" " + scores[r][c]);
            }
            writer.println();
        }

        writer.close();

        System.out.println("=== Average Score for Each Course ===");
        for (int c = 0; c < courseCount; c++) {
            double sum = 0;
            for (int r = 0; r < names.size(); r++) {
                sum += scores[r][c];
            }
            System.out.println(titles[c + 1] + ": " + (sum / names.size()));
        }

        System.out.println("\n=== Average Score for Each Person ===");
        for (int r = 0; r < names.size(); r++) {
            double sum = 0;
            for (int c = 0; c < courseCount; c++) {
                sum += scores[r][c];
            }
            System.out.println(names.get(r) + ": " + (sum / courseCount));
        }
    }
}

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataLoader {
    public static String[] getRandomData() {
        String[] files = {"hiragana.csv", "katakana.csv"};
        String[] types = {"Hiragana", "Katakana"};
        Random rand = new Random();
        int index = rand.nextInt(2);
        String file = "../data/" + files[index];
        String type = types[index];

        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return new String[]{"Error", "Error", "Error"};
        }

        if (lines.isEmpty()) {
            return new String[]{"No data", "No data", "No data"};
        }

        String randomLine = lines.get(rand.nextInt(lines.size()));
        String[] parts = randomLine.split(";");
        if (parts.length >= 2) {
            return new String[]{parts[0], parts[1], type};
        } else {
            return new String[]{"Invalid", "Invalid", type};
        }
    }
}
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoadCSV {
    public static void loadFile() {
        String file = "src\\results.csv";
        BufferedReader reader = null;
        String line = "";

        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {

                String[] row = line.split(",");

                for (String index : row) {
                    System.out.printf("%s ", index);
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}

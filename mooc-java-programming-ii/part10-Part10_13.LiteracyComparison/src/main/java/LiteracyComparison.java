
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LiteracyComparison {
    
    public static void main(String[] args) {
      // First read the csv file and store each row into a List<String>
      String filePath = "/home/euihyunbaek88/.local/share/tmc/vscode/mooc-java-programming-ii/part10-Part10_13.LiteracyComparison/literacy.csv";  // The absolute file path
      
    }

    public static List<Literacy> readFromCSV (String filePath) {
      List<Literacy> result;
      try {
        result = Files.lines(Paths.get(filePath))
                      .map(row -> row.split(","))
                      .filter(info -> info.length >= 5)
                      .map(info -> new Literacy(info[3].trim(), info[2].trim().substring(0, indexOf(" ")), Integer.valueOf(index[4].trim()), Double.valueOf(index[5].trim())))
                      .collect(Collectors.toCollection(ArrayList::new));
      
      } catch (Exception e) {
        // TODO: handle exception
      }
    }
}


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LiteracyComparison {
    
    public static void main(String[] args) {
      // First read the csv file and store each row into a List<String>
      String filePath = "literacy.csv";  // You can put the relative file path as well
      List<Literacy> literacyList = readFromCSV(filePath); // Reads data from the csv file and converts it into Literacy object list
      // From the literacy list, sort by literacy rate and print the contents from the lowest to the highest
      literacyList.stream() // Opens a stream
                  .sorted() // Sort the stream as defined by compareTo method implemented in Literacy class
                  .forEach(System.out::println);  // Prints each Literacy object from the list as defined by toString method in Literacy class
    }

    // Method for reading a CSV file and extract relevant data into Literacy objects, which are then stored in a List
    public static List<Literacy> readFromCSV (String filePath) {
      List<Literacy> result;
      try {
        result = Files.lines(Paths.get(filePath)) // Opens a stream, reads each line, stores each line in the stream as a string
                      .map(row -> row.split(",")) // Splits each string by comma
                      .filter(info -> info.length >= 5) // Leaves out "contaminated" data by filtering out String arrays having less than 5 elements
                      .map(info -> new Literacy(info[3].trim(), (info[2].trim().split(" "))[0], Integer.valueOf(info[4].trim()), Double.valueOf(info[5].trim()))) // Maps each String array into a Literacy object. Each element needs to be trimmed first.
                      .collect(Collectors.toCollection(ArrayList::new));  // Stores Literacy objects into an ArrayList
        return result;
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
      result = new ArrayList<>();
      return result;
    }//method
}//class

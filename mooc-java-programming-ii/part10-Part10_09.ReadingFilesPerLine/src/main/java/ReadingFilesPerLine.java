
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test the method here
      System.out.print("Please enter the name of the text file to be processed: ");
      String fileName = scanner.nextLine();
      List<String> textLines = read(fileName);
      scanner.close();  // closes the scanner
      // Opens a stream and prints out each string, which is equivalent to each row of the original text file
      textLines.stream().forEach(System.out::println);
    }//main

    public static List<String> read(String file) {
      
      try {
        // Opens a stream of lines from a text file, stores each line to the list, and returns the list
        return Files.lines(Paths.get(file)).collect(Collectors.toList());
      } catch(Exception e) {
        System.out.println("Error: " + e.getMessage());
      }

      return new ArrayList<>();
    }//method
}//class

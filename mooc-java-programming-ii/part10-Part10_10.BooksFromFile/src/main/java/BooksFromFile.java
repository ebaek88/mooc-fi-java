
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Opens a Scanner
        // test your method here
        String fileName = scanner.nextLine(); // Reads the file path. The file path should be the absolute path.
        List<Book> bookInfo = readBooks(fileName); // Reads from the txt file that contains each line of book info. Returns a List<String> file.
        scanner.close();  // Closes the Scanner

        // Prints the book info in toString() format
        bookInfo.stream().forEach(System.out::println);

    }//main

    public static List<Book> readBooks(String fileName) {
      List<Book> bookInfo;
      // Reads a txt file where each contains information of a book
      try {
        bookInfo = Files.lines(Paths.get(fileName))   // Reads each line from the txt file and store it in a stream of strings
                                    .map(line -> line.split(",")) // Maps each string to an array of strings that contains different types of info split by comma
                                    .filter(info -> info.length >= 4) // Leaves out the arrays that have less than four elements since they are "contaminated"
                                    .map(info -> new Book(info[0], Integer.valueOf(info[1]), Integer.valueOf(info[2]), info[3]))  // Maps each array of strings to a Book object
                                    .collect(Collectors.toCollection(ArrayList::new));  // Puts the Book objects into an ArrayList
        return bookInfo;  // Returns the processed list
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }

      bookInfo = new ArrayList<>();
      return bookInfo;
    }//method
}//class

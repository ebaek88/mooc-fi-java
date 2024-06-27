
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Prepares a scanner
        List<Book> bookList = new ArrayList<>();  // List for storing books
        bookList = addBooks(bookList, scanner);   // Add books to the list
        scanner.close();  // Closes the scanner
        System.out.println();
        
        // Sorts the list first by age recommendation and then by name if they have the same age
        Comparator<Book> comparator = Comparator.comparing(Book::getRecommendedAge).thenComparing(book -> book.getBookName());
        // Applies the comparisons to the list
        Collections.sort(bookList, comparator);

        // Opens a stream and prints out all the books in the list
        System.out.println("Books:");
        bookList.stream().forEach(System.out::println);
    }//main

    // Method for adding books to the list
    public static List<Book> addBooks(List<Book> bookList, Scanner scanner) {
      while(true) {
        System.out.print("Input the name of the book, empty stops: ");
        String bookName = scanner.nextLine();
        if(bookName.isEmpty()) {
          System.out.println();
          System.out.println(bookList.size() + " books in total.");
          break;
        }
        System.out.print("Input the age recommendation: ");
        int recommendedAge = Integer.valueOf(scanner.nextLine());
        bookList.add(new Book(bookName, recommendedAge));
        System.out.println();
      }

      return bookList;
    }//method
}//class

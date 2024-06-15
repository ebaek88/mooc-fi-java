import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        // ArrayList for storing Book objects
        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // input for Book objects
        while(true) {
            System.out.print("Title: ");
            String bookTitle = scanner.nextLine();
            // exits the loop if the bookTitle is empty
            if(bookTitle.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int bookPages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int bookYear = Integer.valueOf(scanner.nextLine());

            // add a Book instance to the ArrayList
            bookList.add(new Book(bookTitle, bookPages, bookYear));
        }

        System.out.println("");

        // asks the user which part of information needs to be printed
        // assumes that the user writes lowercase letters only
        System.out.print("What information will be printed? ");
        String menu = scanner.nextLine();
        // if nothing is entered, exits the program
        if(menu.isEmpty()) {
            return;
        }

        // if the user inputs "everything", all the info will be printed using toString()
        if(menu.equals("everything")) {
            for(int i = 0; i < bookList.size(); i++) {
                System.out.println(bookList.get(i));
            }
        }
        // if the user inputs "name", just print the title of the book
        if(menu.equals("name")) {
            for(int j = 0; j < bookList.size(); j++) {
                System.out.println(bookList.get(j).getTitle());
            }
        }
        // if the user inputs "pages", just print the pages
        if(menu.equals("pages")) {
            for(int k = 0; k < bookList.size(); k++) {
                System.out.println(bookList.get(k).getPages() + " pages");
            }
        }
        // if the user inputs "year", just print the publication year
        if(menu.equals("year")) {
            for(int n = 0; n < bookList.size(); n++) {
                System.out.println(bookList.get(n).getPubYear());
            }
        }
        scanner.close();
    }
}

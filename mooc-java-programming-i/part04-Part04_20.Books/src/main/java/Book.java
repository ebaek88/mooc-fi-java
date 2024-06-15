// implements the class Book
public class Book {

    private String title; // variable for the title of the book
    private int pages; // variable for the number of pages
    private int pubYear; // variable for the publication year

    // constructor
    public Book(String title, int pages, int pubYear) {
        this.title = title;
        this.pages = pages;
        this.pubYear = pubYear;
    }

    // getter for the title
    public String getTitle() {
        return this.title;
    }

    // getter for the number of pages
    public int getPages() {
        return this.pages;
    }

    // getter for the publication year
    public int getPubYear() {
        return pubYear;
    }
    
    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.pubYear;
    }
}

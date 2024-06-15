public class Book {
    private String author;
    private String name;
    private int pages;

    // constructor
    public Book(String author, String name, int pages) {
        this.author = author;
        this.name = name;
        this.pages = pages;
    }

    // getter for the author
    public String getAuthor() {
        return this.author;
    }

    // getter for the name
    public String getName() {
        return this.name;
    }

    // getter for the page
    public int getPages() {
        return this.pages;
    }

    // String representation
    public String toString() {
        return this.author + ", " + this.name + ", " + this.pages + " pages";
    }
}

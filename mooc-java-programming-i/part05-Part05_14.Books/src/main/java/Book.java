
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    // overrides the equals method
    // if the object is in the ArrayList and when ArrayList uses
    // contains method, it will use the overridden equals method below
    public boolean equals(Object compared) {
        // if two variables have the same reference, they are equal
        if(this == compared) {
            return true;
        }

        // if two objects are of different types, they are not equal
        if(!(compared instanceof Book)) {
            return false;
        }

        // convert the Object object to the Book type
        Book comparedBook = (Book)compared;

        // compare the contents of the two objects
        if(this.name.equals(comparedBook.name) 
            && this.publicationYear == comparedBook.publicationYear) {
            return true;
        }

        return false;
    }

}

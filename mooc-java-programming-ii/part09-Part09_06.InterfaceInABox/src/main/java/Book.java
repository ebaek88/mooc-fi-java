public class Book implements Packable {
  private String name;
  private String author;
  private double weight;

  //constructor
  public Book(String author, String name, double weight) {
    this.author = author;
    this.name = name;
    this.weight = weight;
  }

  // implements the abstract method of the interface Packable
  @Override
  public double weight() {
    return this.weight;
  }

  @Override
  public String toString() {
    return author + ": " + name;
  }
}

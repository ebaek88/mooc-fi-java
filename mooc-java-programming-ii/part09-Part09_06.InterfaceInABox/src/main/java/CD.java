public class CD implements Packable {
  private String artist;
  private String name;
  private int pubYear;
  private final double WEIGHT = 0.1;

  //constructor
  public CD(String artist, String name, int pubYear) {
    this.artist = artist;
    this.name = name;
    this.pubYear = pubYear;
  }

  // implements the abstract method of the interface Packable
  @Override
  public double weight() {
    return WEIGHT;
  }

  @Override
  public String toString() {
    return artist + ": " + name + " (" + pubYear + ")"; 
  }
}

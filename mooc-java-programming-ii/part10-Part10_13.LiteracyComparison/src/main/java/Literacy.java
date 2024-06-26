public class Literacy implements Comparable<Literacy> {
  private String country;
  private String gender;
  private int year;
  private double rate;

  // constructor
  public Literacy(String country, String gender, int year, double rate) {
    this.country = country;
    this.gender = gender;
    this.year = year;
    this.rate = rate;
  }

  // getters
  public String getCountry() {
    return this.country;
  }

  public String getGender() {
    return this.gender;
  }

  public int getYear() {
    return this.year;
  }

  public double getRate() {
    return this.rate;
  }

  @Override
  public String toString() {
    return country + " (" + year + "), " + gender + ", " + rate;
  }

  // Implements toCompare by comparing the literacy rate
  @Override
  public int compareTo(Literacy compared) {
    double difference = this.getRate() - compared.getRate();
    int result = 0;
    if(difference > 0) {  // if the difference is positive, it needs to go through a ceiling function to get a positive integer
      result = (int) Math.ceil(difference);
    } else {  // else, it needs to go through a floor function to get a negative integer
      result = (int) Math.floor(difference);
    }
    return result;
  }
}
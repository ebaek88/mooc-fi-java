public class Book {
  private String bookName; // book title
  private int recommendedAge; // age for recommendation

  // constructor
  public Book(String bookName, int recommendedAge) {
    this.bookName = bookName;
    this.recommendedAge = recommendedAge;
  }

  // getters
  public String getBookName() {
    return this.bookName;
  }

  public int getRecommendedAge() {
    return this.recommendedAge;
  }

  @Override
  public String toString() {
    return bookName + " (recommended for " + recommendedAge + " year-olds or older)";
  }
}//class
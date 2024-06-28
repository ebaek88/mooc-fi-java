public class Person {
  private String name;
  private Education edu;

  // Constructor
  public Person(String name, Education edu) {
    this.name = name;
    this.edu = edu;
  }

  // getter
  public Education getEducation() {
    return edu;
  }

  // toString
  @Override
  public String toString() {
    return name + ", " + edu;
  }
}//class

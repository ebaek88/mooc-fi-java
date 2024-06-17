public class Teacher extends Person {
  private int salary; // variable for the monthly salary of a teacher in euro

  public Teacher(String name, String address, int salary) {
    super(name, address);
    this.salary = salary;
  } 

  // toString. overrides the toString method of Person class
  @Override
  public String toString() {
    return super.toString() + "\n  salary " + this.salary + " euro/month";
  }
}

public class Student extends Person {
  private int credit; // variable for study credits

  // constructor
  public Student(String name, String address) {
    super(name, address); //invokes the constuctor of the superclass
    this.credit = 0; //sets the credit to zero by default
  }

  // getter for the credits
  public int credits() {
    return this.credit;
  }

  // setter fot the credits. each time the method is called, the credit increases by 1.
  public void study() {
    this.credit++;
  }

  // toString. overrides the toString method of the superclass
  @Override
  public String toString() {
    return super.toString() + "\n  Study credits " + this.credit;
  }
}

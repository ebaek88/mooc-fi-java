public class Dog extends Animal {
  
  //constructor with a name parameter
  public Dog(String name) {
    super(name);
  }

  //non-parameterized constructor
  public Dog() {
    super("Dog");
  }

  //must implement the inherited abstract method NoiseCapable.makeNoise()
  public void makeNoise() {
    System.out.println(this.name + " barks");
  }

  //a Dog barks
  public void bark() {
    this.makeNoise();
  }
}

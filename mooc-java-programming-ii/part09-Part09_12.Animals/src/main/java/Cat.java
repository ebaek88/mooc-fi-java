public class Cat extends Animal {
  
  //constructor with a name parameter
  public Cat(String name) {
    super(name);
  }

  //non-parameterized constructor
  public Cat() {
    super("Cat");
  }

  //must implement the inherited abstract method NoiseCapable.makeNoise()
  public void makeNoise() {
    System.out.println(this.name + " purrs");
  }

  //a Cat object purrs
  public void purr() {
    this.makeNoise();
  }
}

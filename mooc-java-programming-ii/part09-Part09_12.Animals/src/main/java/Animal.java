public abstract class Animal implements NoiseCapable {
  // the abstract class Animal implements interface NoiseCapable
  // however, it does not implement the method makeNoise.
  // by doing so, it delegates the responsibility of implementation to the inheriting class
  
  protected String name; // variable for storing the name of an animal

  //constructor
  public Animal(String name) {
    this.name = name;
  }

  //"(name) eats"
  public void eat() {
    System.out.println(name + " eats");
  }

  //"(name) sleeps"
  public void sleep() {
    System.out.println(name + " sleeps");
  }

  //returns the name of the animal
  public String getName() {
    return name;
  }

}

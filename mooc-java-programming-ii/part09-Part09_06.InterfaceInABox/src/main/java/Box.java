import java.util.ArrayList;

public class Box implements Packable {
  private double capacity; // maximum capacity of the box
  private ArrayList<Packable> packableList;

  //constructor
  public Box(double capacity) {
    this.capacity = capacity;
    this.packableList = new ArrayList<>();
  }

  //method for adding Packable items to a Box
  public void add(Packable packable) {
    // if the Packable item is heavier than the remaining capacity of the box, the item cannot be contained
    if(packable.weight() > capacity) {
      return;
    }
    // if the item is containable, add it and deduct the current capacity of the box by the weight of the item
    capacity = capacity - packable.weight();
    packableList.add(packable); // adds the items to the list
  }

  // implements the abstract method of the interface Packable
  @Override
  public double weight() {
    double weight = 0.0;
    //iterate through the ArrayList and obtain the weight using weight() method
    for(Packable element : packableList) {
      weight += element.weight();
    }
    return weight;
  }

  @Override
  public String toString() {
    return "Box: " + this.packableList.size() + " items, total weight " + this.weight() + " kg";
  }
}

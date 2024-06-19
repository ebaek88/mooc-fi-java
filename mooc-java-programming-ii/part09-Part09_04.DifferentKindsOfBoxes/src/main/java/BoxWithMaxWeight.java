import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
  
  private ArrayList<Item> items; // variable for the list of Items
  private int capacity; // variable for the maximum weight allowed for tha box
  
  //constructor
  public BoxWithMaxWeight(int capacity) {
    this.capacity = capacity;
    this.items = new ArrayList<>();
  }

  //implementing the add method
  @Override
  public void add(Item item) {
    //check if the item causes the box to exceed its weight capacity
    if(item.getWeight() > capacity) {
      return;
    }

    items.add(item);
    capacity -= item.getWeight();

  }

  //implementing the isInBox method
  @Override
  public boolean isInBox(Item item) {
    return items.contains(item);
  }
}

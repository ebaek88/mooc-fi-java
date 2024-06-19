import java.util.ArrayList;

public class OneItemBox extends Box {
  
  private ArrayList<Item> items; // variable for the list of Items
  private final int CAPACITY = 1; // OneItemBox has the capacity of one item

  //constructor
  public OneItemBox() {
    items = new ArrayList<>();
  }

  //implementing the add method
  @Override
  public void add(Item item) {
    //if there is an item already in the box, it cannot contain anymore. nor can it switch the items.
    if(items.size() >= CAPACITY) {
      return;
    }

    items.add(item);
  }

  //implementing the isInBox method
  @Override
  public boolean isInBox(Item item) {
    return items.contains(item);
  }
}

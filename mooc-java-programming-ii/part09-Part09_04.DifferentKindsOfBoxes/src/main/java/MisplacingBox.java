import java.util.ArrayList;

public class MisplacingBox extends Box {
  
  private ArrayList<Item> items; // variable for the list of Items

  //constructor
  public MisplacingBox() {
    items = new ArrayList<>();
  }

  //implementing the add method
  @Override
  public void add(Item item) {
    items.add(item);
  }

  //implementing the isInBox method
  @Override
  public boolean isInBox(Item item) {
    return false; //must always return false as specified in the problem
  }
}

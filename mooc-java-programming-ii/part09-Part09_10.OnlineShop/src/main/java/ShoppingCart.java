import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
  private Map<String, Item> shoppingList; //variable for storing product names and their Items

  //constructor
  public ShoppingCart() {
    shoppingList = new HashMap<>();
  }

  // adds an item to the cart that matches the product given as a parameter, with the price given as a parameter.
  public void add(String product, int price) {
    //if the product is already in the cart, we only increase the quantity by one
    if(shoppingList.containsKey(product)) {
      Item temp = shoppingList.get(product);
      temp.increaseQuantity();
      shoppingList.replace(product, temp);
      return;
    }
    
    shoppingList.put(product, new Item(product, 1, price));
  }

  // returns the total price of the shopping cart.
  public int price() {
    int totalPrice = 0; // temporary variable for storing the total price
    // iterates through the map and add all the prices of the items in a shopping cart
    for(Item element : shoppingList.values()) {
      totalPrice += element.price();
    }

    return totalPrice;
  }

  // prints the list of Items in a shopping cart. only product names and their quantities are displayed.
  public void print() {
    for(Item element : shoppingList.values()) {
      System.out.println(element);
    }
  }
}

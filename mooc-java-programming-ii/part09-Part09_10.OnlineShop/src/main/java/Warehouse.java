import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
  private Map<String, Integer> priceMap; //variable for storing products and their prices
  private Map<String, Integer> stockMap; //variable for storing products and their stock

  //constructor
  public Warehouse() {
    priceMap = new HashMap<>();
    stockMap = new HashMap<>();
  }

  //adds a product to the warehouse with the price and stock balance given as parameters
  public void addProduct(String product, int price, int stock) {
    priceMap.put(product, price);
    stockMap.put(product, stock);
  }

  //returns the price of the product it received as a parameter
  public int price(String product) {
    if(priceMap.containsKey(product)) {
      return priceMap.get(product);
    }

    return -99; //if priceMap does not containt the product as a key, return -99
  }

  //returns the current remaining stock of the product in the warehouse
  public int stock(String product) {
    if(stockMap.containsKey(product)) {
      return stockMap.get(product);
    }

    return 0; //if the product hasn't been added to the warehouse, the method must return 0
  }

  //reduces the stock remaining for the product it received as a parameter by one, and returns true if there was stock remaining
  public boolean take(String product) {
    int currentStock = this.stock(product); // temporary variable for the current stock of the product
    
    //if the stock of the product is zero, return false
    if(this.stock(product) <= 0) {
      return false;
    }

    //if not, deduct the current stock by one and return true
    currentStock--;
    this.stockMap.replace(product, currentStock);
    return true;
  }

  //returns the names of the products in the warehouse as a Set
  public Set<String> products() {
    return this.priceMap.keySet();
  }
}//class

public class ProductWarehouseWithHistory extends ProductWarehouse {
  
  private ChangeHistory history; // variable to store change history
  // private double balance; //if you create the same variable in the subclass even if you inherit it from the superclass, they are recognized as distinct
  //constructor
  public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
    super(productName, capacity); //uses the constructor of ProductWarehouse
    history = new ChangeHistory();
    this.addToWarehouse(initialBalance);
  }

  //overriding the existing method of Warehouse class 
  @Override
  public void addToWarehouse(double amount) {
    super.addToWarehouse(amount); //works just like the method in the Warehouse class
    history.add(this.balance); //but also record the changed state to the history
  }

  //overriding the existing method of Warehouse class
  @Override
  public double takeFromWarehouse(double amount) {
    double result = super.takeFromWarehouse(amount); //works just like the method in the Warehouse class
    history.add(this.balance); //but also record the changed state to the history
    return result;
  }

  //prints history related information for the product in the way presented in the example
  public void printAnalysis() {
    System.out.println("Product: " + this.getName());
    System.out.println("History: " + this.history());
    System.out.println("Largest amount of product: " + this.history.maxValue());
    System.out.println("Smallest amount of product: " + this.history.minValue());
    System.out.println("Average: " + this.history.average());
  }

  //returns the product history
  public String history() {
    return history.toString();
  }

}

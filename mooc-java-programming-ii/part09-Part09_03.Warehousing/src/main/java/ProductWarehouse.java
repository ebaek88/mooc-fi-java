public class ProductWarehouse extends Warehouse{
  
  private String productName; // variable for a productName

  //constructor
  public ProductWarehouse(String productName, double capacity) {
    super(capacity);
    this.productName = productName;
  }

  // getter for the name of the product
  public String getName() {
    return this.productName;
  }

  // setter for the name of the product
  public void setName(String newName) {
    productName = newName;
  }

  @Override
  public String toString() {
    return this.productName + ": " + super.toString();
  }

}

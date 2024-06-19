public class CustomTacoBox implements TacoBox {
  private int tacos; //variable for the number of tacos

  //constructor
  public CustomTacoBox(int tacos) {
    this.tacos = tacos;
  }

  //implements the abstract method of TacoBox
  @Override
  public int tacosRemaining() {
    // return the number of tacos remaining in the box
    return this.tacos;
  }

  //implements the abstract method of TacoBox
  @Override
  public void eat() {
    //check if the remaining number of tacos is already zero
    if(this.tacos <= 0) {
      return;
    }
    //if not, reduce the number of tacos remaining by one
    this.tacos--;
  }
}

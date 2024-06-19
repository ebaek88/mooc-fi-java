public class Organism implements Movable {
  private int x; //x coordinate of the position of an Organism
  private int y; //y coordinate of the position of an Organism

  //constructor
  public Organism(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return "x: " + x + "; y: " + y;
  }

  //implements the abstract method move of interface Movable. Moves the herd with by the amount specified by the parameters.
  @Override
  public void move(int dx, int dy) {
    x = x + dx;
    y = y + dy;
  }
}

public class Bot extends Player {
  @Override
  public void play() {
    System.out.println("Bot play!");
  }

  public void addMove(String move) {
    System.out.println(move + " added!");
  }
}

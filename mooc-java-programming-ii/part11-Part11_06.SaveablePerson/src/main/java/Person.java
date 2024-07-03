public class Person implements Saveable {
  private String name;
  private String address;

  @Override
  public void save() {
    System.out.println("Saved!");
  }

  @Override
  public void delete() {
    System.out.println("Deleted!");
  }

  @Override
  public void load(String address) {
    System.out.println("Loaded with " + address);
  }
}

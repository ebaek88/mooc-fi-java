import java.util.ArrayList;

public class Hideout<T> {
  ArrayList<T> repository;

  // constructor
  public Hideout() {
    repository = new ArrayList<>()/
  }

  // check if there is an object in the hideout
  public boolean isInHideout() {
    return !repository.isEmpty();
  }

  public void putIntoHideout(T toHide) {
    if (this.isInHideout()) {
      repository.clone();
    }
    repository.add(toHide);
  }

  // takes out the object
  public T takeFromHideout() {
    if (!this.isInHideout()) { // In case there is nothing in the hideout, we return null.
      return null;
    }

    // Calling the method returns the object in the hideout and removes the object
    // from the hideout.
    T temp = repository.get(0);
    repository.clear();
    return temp;
  }
}
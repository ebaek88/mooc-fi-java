import java.util.ArrayList;

public class Pipe<T> {
  private ArrayList<T> pipe;

  // constructor
  public Pipe() {
    pipe = new ArrayList<>();
  }

  // puts an object with a type in accordance with the type parameter given to the
  // the class into the pipe.
  public void putIntoPipe(T value) {
    pipe.add(value); // an ArrayList puts a new element at the end of the list unless the index is
                     // not specified.
  }

  // returns the value true if the pipe has values. In case the pipe is empty, it
  // returns the value false.
  public boolean isInPipe() {
    return !pipe.isEmpty();
  }

  // takes out the value, which has been in the pipe the longest. Calling the
  // method returns the value, which has been in the pipe the longest, and removes
  // it from the pipe.
  public T takeFromPipe() {
    if (!isInPipe()) { // In case there is nothing in the pipe, return null.
      return null;
    }
    T temp = pipe.get(0);
    pipe.remove(0);
    return temp;
  }
}

// implementing a Java ArrayList
public class List<Type> { // a generic class
  private Type[] values; // a generic array. the type of the elements in the array is defined on run time
                         // using type parameters.
                         // Let's set the size of the array to 10.
  private int firstFreeIndex; // an int variable to keep track of the first empty index in the array

  // constructor
  public List() {
    this.values = (Type[]) new Object[10]; // Type parameter 'Type' cannot be instantiated directly because Java does
                                           // not support the call new Type[10]; for now.
                                           // In the beginning, every element in the array contains a null-reference.
    this.firstFreeIndex = 0;
  }

  // adds an element to the list
  public void add(Type value) {
    if (this.firstFreeIndex == this.values.length) {
      grow();
    }

    this.values[this.firstFreeIndex] = value;
    this.firstFreeIndex++;
  }// method

  // if the array is full, a new array is created and the elements from the old
  // array are copied into the new one.
  private void grow() {
    int newSize = this.values.length + this.values.length / 2; // This is the actual implementation within the built-in
                                                               // ArrayList.
    Type[] newValues = (Type[]) new Object[newSize];
    for (int i = 0; i < this.values.length; i++) {
      newValues[i] = this.values[i]; // The automatic Java garbage collector removes the old array at some point, now
                                     // that there are no longer any references to it.
    }

    this.values = newValues;
  }// method

  // checks whether the list contains a value or not
  public boolean contains(Type value) {
    return indexOfValue(value) >= 0;
  }// method

  // searches for the index of the given value.
  public int indexOfValue(Type value) {
    for (int i = 0; i < this.firstFreeIndex; i++) {
      if (this.values[i].equals(value)) {
        return i;
      }
    }

    return -1; // The method returns -1 if the value is not found.
  }// method

  // moves values from the given index one place to the left.
  private void moveToLeft(int fromIndex) {
    for (int i = fromIndex; i < this.firstFreeIndex - 1; i++) {
      this.values[i] = this.values[i + 1];
    }
  }

  // removes an element from the list. If possible, move the following elements to
  // the left by one cell to fill the gap.
  public void remove(Type value) {
    int indexOfValue = indexOfValue(value);
    if (indexOfValue < 0) {
      return; // not found
    }

    moveToLeft(indexOfValue);
    this.firstFreeIndex--;
  }

  // returns the value in the given index of the list. If the user searches for a
  // value in an index outside of the array, IndexOutOfBoundsException is thrown.
  public Type value(int index) {
    if (index < 0 || index >= this.firstFreeIndex) {
      throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + (this.firstFreeIndex - 1) + "]");
    }

    return this.values[index];
  }

  // returns the size of the list
  public int size() {
    return this.firstFreeIndex;
  }
}// class
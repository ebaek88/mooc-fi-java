import java.util.ArrayList;

public class ChangeHistory {
  private ArrayList<Double> changeHistory;
  
  //constructor
  public ChangeHistory() {
    this.changeHistory = new ArrayList<>();
  }

  //returns the size of the ArrayList
  public int getSize() {
    return changeHistory.size();
  }

  //adds provided status as the latest amount to remember in the change history
  public void add(double status) {
    changeHistory.add(status);
  }

  //empties the history
  public void clear() {
    changeHistory.clear();
  }

  //returns the largest value in the change history
  public double maxValue() {
    //if the history is empty, return zero
    if(changeHistory.size() <= 0) {
      return 0;
    }

    // temporary variable for storing the temporary maximum
    double max = -1.0;

    //iterates through the ArrayList and compares each element to max
    for(double element : changeHistory) {
      if(element > max) {
        max = element;
      }
    }

    //returns the maximum value of the ArrayList
    return max;
  }

  //returns the smallest value in the change history
  public double minValue() {
    //if the history is empty, return zero
    if(changeHistory.size() <= 0) {
      return 0;
    }

    // temporary variable for storing the temporary minimum
    double min = changeHistory.get(0);

    //iterates through the ArrayList and compares each element to min
    for(double element : changeHistory) {
      if(element < min) {
        min = element;
      }
    }

    //returns the minimum value of the ArrayList
    return min;
  }

  //returns the average of the values in the change history
  public double average() {
    //if the history is empty, return zero
    if(changeHistory.size() <= 0) {
      return 0;
    }

    //temporary variable to store the sum
    double sum = 0.0;

    //adds all the elements to the sum
    for(double element : changeHistory) {
      sum += element;
    }

    //returns the average
    return sum / changeHistory.size();
  }

  //simply uses the toString method provided by the ArrayList class
  public String toString() {
    return changeHistory.toString();
  }
}

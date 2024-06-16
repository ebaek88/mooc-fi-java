import java.util.HashMap;

public class IOU {
  private HashMap<String, Double> ledger;

  //constructor
  public IOU() {
    this.ledger = new HashMap<>();
  }

  //saves the amount owed and the person owed to to the IOU
  public void setSum(String toWhom, double amount) {
    toWhom = sanitizeString(toWhom);
    ledger.put(toWhom, amount);
  }

  //returns the amount owed to the person whose name is given as a parameter. If the person cannot be found, it returns 0.
  public double howMuchDoIOweTo(String toWhom) {
    toWhom = sanitizeString(toWhom);
    return ledger.getOrDefault(toWhom, (double)0);
  }

  private static String sanitizeString(String input) {
    //if the string is null, make it an empty string
    if(input == null) {
      input = "";
      return input;
    }

    //make all the letters lowercase and trim out the whitespaces at the beginning and the end of the string
    input = input.toLowerCase();
    input = input.trim();

    return input;
  }
}

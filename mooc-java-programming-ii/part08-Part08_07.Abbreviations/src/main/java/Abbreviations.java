import java.util.HashMap;

public class Abbreviations {
  private HashMap<String, String> abbv; // a HashMap as an instance variable

  //NoArgConstructor
  public Abbreviations() {
    this.abbv = new HashMap<>();
  }

  //adding an abbreviation and its explation to the HashMap
  public void addAbbreviation(String abbreviation, String explanation) {
    abbreviation = sanitizeString(abbreviation);
    explanation = sanitizeString(explanation);

    if(this.hasAbbreviation(abbreviation)) {
      System.out.println("The list already hast the abbreviation in the list.");
    } else {
      this.abbv.put(abbreviation, explanation);
    }
  }

  // checks if the HashMap already contains the abbreviation in query
  public boolean hasAbbreviation(String abbreviation) {
    abbreviation = sanitizeString(abbreviation);
    return this.abbv.containsKey(abbreviation);
  }

  // retrieves the explanation associated with the abbreviation in query
  public String findExplanationFor(String abbreviation) {
    abbreviation = sanitizeString(abbreviation);
    return this.abbv.get(abbreviation);
  }

  // sanitizies a string
  public static String sanitizeString(String string) {
    // if the string itself is null, make it an empty string
    if(string == null) {
      return "";
    }

    String sanitizedString = string.toLowerCase(); // make all the letters into lowercases
    sanitizedString = sanitizedString.trim(); // trim all the whitespaces at the beginning and the end of the string

    return sanitizedString;
  }
}

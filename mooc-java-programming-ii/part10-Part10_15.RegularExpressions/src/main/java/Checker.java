

public class Checker {
  // Returns true if the parameter string is an abbreviation of a day of the week (mon, tue, wed, thu, fri, sat, sun)
  public boolean isDayOfWeek(String string) {
    String regex = "mon|tue|wed|thu|fri|sat|sun";
    return string.matches(regex);
  }

  // Returns true if all the characters in the parameter string are vowels
  public boolean allVowels(String string) {
    String regex = "[aeiou]+";
    return string.matches(regex);
  }

  // Checks whether the parameter string expresses a time of day in the form hh:mm:ss (hours, minutes, and seconds each always take up two spaces).
  // We use the 24-hour clock. So the acceptable values are between 00:00:00 and 23:59:59.
  public boolean timeOfDay(String string) {
    String regex = "([0-1]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
    return string.matches(regex);
  }
}

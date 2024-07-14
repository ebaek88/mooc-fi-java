package dictionary;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SaveableDictionary {
  private Map<String, String> wordMap; // I used a HashMap instead of an ArrayList for this time.
  private String file; // variable to store a file path

  // constructor 1 (default)
  public SaveableDictionary() {
    wordMap = new HashMap<>();
  }

  // constructor 2 (with a file path as a parameter)
  public SaveableDictionary(String file) {
    wordMap = new HashMap<>();
    this.file = file;
  }

  // Adds a word to the dictionary. Every word has just one translation, and if
  // the same word is added for the second time, nothing happens.
  public void add(String words, String translation) {
    // if the translation happens to be in the key set, leave the dictionary as it
    // is
    if (wordMap.containsKey(translation)) {
      return;
    }
    wordMap.putIfAbsent(words, translation);
  }// method

  // Returns the translation for the given word. If the word is not in the
  // dictionary, returns null.
  public String translate(String word) {
    if (wordMap.containsKey(word)) { // If the word is found in the key set of the hash map, return its value.
      return wordMap.get(word);
    } else { // If not, search the value set. If the key associated with the value is found,
             // return it.
      for (String key : wordMap.keySet()) {
        if (wordMap.get(key).equals(word)) {
          return key;
        }
      }
    }
    // if the word in query does not exist in both, return null.
    return null;
  }// method

  // deletes the given word and its translation from the dictionary.
  public void delete(String word) {
    // First chech if the word is in the key set
    if (wordMap.containsKey(word)) {
      wordMap.remove(word);
    }

    // if not, check if the word is in the value set.
    // If you try to remove the key-value pair while the enhanced for loop is
    // accessing the keySet, it results in ConcurrentModificationException.

    // The reason is that there are more than one thread accessing the same
    // Collection at the same time. If at least one of them tries to modify the
    // Collection, it results in such exception.

    // In order to prevent this, we can access the copied set of the keys.
    // By doing so, it does not affect the original Collection.
    for (String key : Set.copyOf(wordMap.keySet())) { // Do this instead of for (String key : wordMap.keySet())
      if (wordMap.get(key).equals(word)) {
        wordMap.remove(key);
      }
    }
  }// method

  // loads the dictionary from the file given to the constructor as a parameter.
  public boolean load() {
    try {
      Scanner fileReader = new Scanner(Paths.get(this.file));
      while (fileReader.hasNextLine()) {
        String line = fileReader.nextLine();
        String[] parts = line.split(":"); // split the line based on the ':' character
        add(parts[0], parts[1]); // add to the map
      }

      fileReader.close();
    } catch (Exception e) {
      // If the program is unable to open the file or read from it, the method returns
      // false
      return false;
    }

    return true;
  }// method

  public boolean save() {
    try (PrintWriter writer = new PrintWriter(file)) { // opens a PrintWriter
      for (String key : wordMap.keySet()) { // iterates all the keys and save the key-value pairs into Strings
        writer.println(key + ":" + wordMap.get(key)); // the key and the value are separated by ':'
      }
      writer.close(); // closes the PrintWriter object
    } catch (FileNotFoundException e) {
      // returns false if the program cannot save to the file.
      return false;
    }
    return true;
  }
}// class

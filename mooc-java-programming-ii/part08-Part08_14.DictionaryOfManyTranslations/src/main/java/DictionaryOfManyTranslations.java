import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
  private HashMap<String, ArrayList<String>> dictionary;

  public DictionaryOfManyTranslations() {
    dictionary = new HashMap<>();
  }

  // adds the translation for the word and preserves the old translations
  public void add(String word, String translation) {
    // if the word is not in the dictionary, add and create the list of translations
    if(!dictionary.containsKey(word)) {
      dictionary.put(word, new ArrayList<>());
    }

    // add the translation to the corresponding list of the word
    ArrayList<String> listOfTranslations = dictionary.get(word);
    listOfTranslations.add(translation);
  }

  public ArrayList<String> translate(String word) {
    // If the word is not in the list, add the word and an empty string as a translation
    if(!dictionary.containsKey(word)){
      dictionary.put(word, new ArrayList<>());
    }

    return dictionary.get(word);
  }

  public void remove(String word) {
    // if there is no such word in the dictionary, do nothing
    if(!dictionary.containsKey(word)) {
      return;
    }

    // remove the key-value pair from the dictionary
    dictionary.remove(word);
  }
}
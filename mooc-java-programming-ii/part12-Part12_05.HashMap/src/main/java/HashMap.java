import java.util.ArrayList;
import java.util.List;

// In the example on the course website, HashMap was implemented using an array.
// However, in this exercise, it is required to use an ArrayList.
public class HashMap<K, V> {
  private ArrayList<Pair<Integer, ArrayList<Pair<K, V>>>> hashValueList; // ArrayList of Pair<Integer, ArrayList<Pair<K,
                                                                         // V>>>. The index of this ArrayList is not
                                                                         // equal to the hash value.
  // In hashValueList, the index matches to the actual hash value of each kay.

  // constructor
  public HashMap() {
    this.hashValueList = new ArrayList<>();
  }

  // search for a value based on a key
  public V get(K key) {
    List<Pair<K, V>> keyValuePairList = getListBasedOnKey(key); // First get the ArrayList corresponding to the hash
                                                                // value of the key

    if (keyValuePairList == null) { // if the list is null, return null
      return null;
    }

    for (Pair<K, V> element : keyValuePairList) { // Now iterate over the list and check if there is any matching
                                                  // key-value pair
      if (element.getKey().equals(key)) {
        return element.getValue();
      }
    }

    return null;
  }// method

  // method to calculate a hash value of a key
  private int calculateHashValue(K key) {
    return Math.abs(key.hashCode());
  }// method

  // adds a key-value pair to the list
  public void add(K key, V value) {
    int hashValue = calculateHashValue(key); // get the hash value of the key
    Pair<Integer, ArrayList<Pair<K, V>>> pairList = null; // get the array list corresponding to
                                                          // the hash value

    if (hashValueList == null || hashValueList.isEmpty()) { // if it does not
                                                            // exits, create a
                                                            // new one and add
                                                            // to the big list
      pairList = new Pair(hashValue, new ArrayList<Pair<K, V>>());
      hashValueList.add(pairList);
    } else {
      for (Pair<Integer, ArrayList<Pair<K, V>>> element : hashValueList) {
        if (element.getKey().equals(hashValue)) {
          pairList = element;
        }
      }

      if (pairList == null) {
        pairList = new Pair(hashValue, new ArrayList<Pair<K, V>>());
        hashValueList.add(pairList);
      }
    }

    List<Pair<K, V>> keyValuePair = pairList.getValue(); // Next, get the list of key-value pairs

    if (keyValuePair.isEmpty() || keyValuePair == null) {
      // If not, add the new key-value pair to the list
      keyValuePair.add(new Pair(key, value));
    } else {
      for (Pair<K, V> element : keyValuePair) { // Iterate over the list of the key-value pairs and check if the pair
                                                // contians the key in parameters
        if (element.getKey().equals(key)) { // If there is one, change the value of the pair
          element.setValue(value);
        }
      }

    }

  }// method

  // removes a key-value pair based on key
  public V remove(K key) {
    List<Pair<K, V>> keyValuePairList = getListBasedOnKey(key);

    for (Pair<K, V> element : keyValuePairList) {
      if (element.getKey().equals(key)) {
        V temp = element.getValue();
        keyValuePairList.remove(element);
        return temp;
      }
    }

    return null;
  }// method

  // method that returns an ArrayList of key-value pairs that corresponds to the
  // hash value of the key
  private List<Pair<K, V>> getListBasedOnKey(K key) {
    int hashValue = calculateHashValue(key); // First calculate the hash value of the key

    List<Pair<K, V>> valuesAtHashValue = null; // create a variable to store the ArrayList of key-value pairs

    // If the larger list does not contain the hash value of the key, that means
    // there is no key-value pair. Then, return null.
    for (Pair<Integer, ArrayList<Pair<K, V>>> element : hashValueList) {
      if (element.getKey() == hashValue) {
        valuesAtHashValue = element.getValue();
      }
    }

    return valuesAtHashValue;
  }
}

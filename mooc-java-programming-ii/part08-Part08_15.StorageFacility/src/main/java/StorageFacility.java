import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
  private HashMap<String, ArrayList<String>> storageHashMap;

  public StorageFacility() {
    storageHashMap = new HashMap<>();
  }

  // adds the parameter item to the storage unit that is also given as a parameter
  public void add(String unit, String item) {
    // if the unit does not exist, make one
    if(!storageHashMap.containsKey(unit)) {
      storageHashMap.put(unit, new ArrayList<>());
    }

    // add the item to the unit
    storageHashMap.get(unit).add(item);
  }

  // returns a list that contains all the items in the storage unit indicated by the parameter
  // If there is no such storage unit or it contains no items, the method should return an empty list
  public ArrayList<String> contents (String storageUnit) {
    // if the unit does not exist, make one
    storageHashMap.putIfAbsent(storageUnit, new ArrayList<>());

    return storageHashMap.get(storageUnit);
  }

  public void remove(String storageUnit, String item) {
    // if the storage facility does not have the storage unit, do nothing
    if(!storageHashMap.containsKey(storageUnit)) {
      return;
    }

    // Only removes one item — if there are several items with the same name, the rest still remain
    ArrayList<String> itemList = storageHashMap.get(storageUnit);
    itemList.remove(item);

    // If the storage unit would be empty after the removal, the method also removes the unit
    if(storageHashMap.get(storageUnit).isEmpty()) {
      storageHashMap.remove(storageUnit);
    }
  }

  // returns the names of the storage units as a list. NB! Only the units that contain items are listed
  public ArrayList<String> storageUnits() {
    ArrayList<String> unitList = new ArrayList<>();

    for(String storageUnit : storageHashMap.keySet()) {
      if(!storageHashMap.get(storageUnit).isEmpty()) {
        unitList.add(storageUnit);
      }
    }

    return unitList;
  }


}

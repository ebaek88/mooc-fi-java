import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
  private HashMap<LicensePlate, String> registry; // HashMap for registering plates and owners

  // constructor w/o parameters
  public VehicleRegistry() {
    this.registry = new HashMap<>();
  }

  // constructor w/ parameter
  public VehicleRegistry(HashMap<LicensePlate, String> registry) {
    this.registry = registry;
  }

  public boolean add(LicensePlate licensePlate, String owner) {
    // if the registry already has the plate and the owner attached, return false
    if(registry.get(licensePlate) != null) {
      return false;
    }

    // else, add the owner to the license plate and return true
    registry.put(licensePlate, owner);
    return true;
  }

  public String get(LicensePlate licensePlate) {
    return registry.get(licensePlate);
  }

  public boolean remove(LicensePlate licensePlate) {
    // if the license plate is not in the registry or the owner is null, return false
    if(!registry.containsKey(licensePlate) || registry.get(licensePlate) == null) {
      return false;
    }
    
    // if the license plate is in the registry, remove it and return true
    registry.remove(licensePlate);
    return true;
  }

  // prints the license plates in the registry
  public void printLicensePlates() {
    for(LicensePlate member : registry.keySet()) {
      System.out.println(member);
    }
  }

  public void printOwners() {
    ArrayList<String> owners = new ArrayList<>();
    // each name should be printed only once, even if a particular person owns more than one car
    for(String member : registry.values()) {
      if(owners.contains(member)) {
        continue;
      }

      owners.add(member);
    }

    for(String member : owners) {
      System.out.println(member);
    }
  }



}


import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object object) {
        // return true if both refers to the same instance
        if(this == object) {
            return true;
        }

        // return false if the object is null or of a different class
        if(object == null || !(object instanceof LicensePlate)) {
            return false;
        }

        // convert the object to a LicensePlate instance
        LicensePlate objectCompared = (LicensePlate)object;

        // return true if the contents are the same
        if(this.country.equals(objectCompared.country) &&
            this.liNumber.equals(objectCompared.liNumber)) {
            return true;
        }

        // otherwise, return false
        return false;

    }

    @Override
    public int hashCode() {
        // delegate the computational responsibility to the String object
        return (this.country.hashCode() + this.liNumber.hashCode());
    }

}

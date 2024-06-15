
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    // returns the longest string of the collection
    public String longest() {
        // if the collection is empty, return null
        if(elements.isEmpty()) {
            return null;
        }

        // start from the first element of the collection
        String longest = elements.get(0);

        for(String element: elements) {
            if(longest.length() < element.length()) {
                longest = element;
            }
        }

        // return the longest string
        return longest;
    }

}

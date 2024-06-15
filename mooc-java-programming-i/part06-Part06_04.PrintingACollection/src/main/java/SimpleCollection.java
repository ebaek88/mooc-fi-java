
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

    public String toString() {

        String output;
        // first check if the list is empty
        if(elements.size() == 0) {
            output = "The collection " + name + " is empty.";
            return output;
        }

        output = "The collection " + name + " has " 
                + elements.size() + " element" 
                + (elements.size() > 1 ? "s:" : ":") + "\n";
        
        for(int i = 0; i < elements.size() ; i++) {
            output = output + elements.get(i) + (i < elements.size() - 1 ? "\n" : "");
        }

        return output;
    }
    
}

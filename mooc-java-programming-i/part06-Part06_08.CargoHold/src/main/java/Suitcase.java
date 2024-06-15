import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> itemList;
    private int maxWeight;
    private int totalWeight;

    public Suitcase(int weight) {
        itemList = new ArrayList<>();
        this.maxWeight = weight;
        this.totalWeight = 0;
    }

    public void addItem(Item item) {
        if(item.getWeight() + this.totalWeight <= this.maxWeight) {
            this.itemList.add(item);
            this.totalWeight += item.getWeight();
        }
    }

    public String toString() {
        String noItems = "";
        if(itemList.size() == 0) {
            noItems = noItems + "no items (" + totalWeight + " kg)";
        }

        String output = "";
        if(itemList.size() >= 1) {
            output += this.itemList.size() 
                        + (this.itemList.size() > 1 ? " items (" : " item (") 
                        + totalWeight + " kg)";
        }
        
        return noItems + output;
    }

    public void printItems() {
        for(Item element : this.itemList) {
            System.out.println(element);
        }
    }

    public int totalWeight() {
        return this.totalWeight;
    }

    public Item heaviestItem() {
        // first check if the suitcase is empty. return null if empty
        if(this.itemList.isEmpty()) {
            return null;
        }

        // first assume that the first item of the list is the heaviest
        Item heaviest = this.itemList.get(0);

        // same as for(Item element : itemList)
        for(int i = 1; i < this.itemList.size(); i++) {
            if(heaviest.getWeight() < this.itemList.get(i).getWeight()) {
                heaviest = this.itemList.get(i);
            }
        }

        return heaviest;
    }
}
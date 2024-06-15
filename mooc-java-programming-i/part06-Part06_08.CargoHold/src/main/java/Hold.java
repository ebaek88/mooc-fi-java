import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> holdList;
    private int maxWeight;
    private int totalWeight;

    public Hold(int maxWeight) {
        holdList = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.totalWeight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        int suitcaseWeight = suitcase.totalWeight();
        if(this.totalWeight + suitcaseWeight <= this.maxWeight) {
            holdList.add(suitcase);
            this.totalWeight += suitcaseWeight;
        }
    }

    public String toString() {
        return this.holdList.size() + " suitcases (" + this.totalWeight + " kg)"; 
    }

    public void printItems() {
        for(Suitcase suitcase : this.holdList) {
            suitcase.printItems();
        }
    }
}

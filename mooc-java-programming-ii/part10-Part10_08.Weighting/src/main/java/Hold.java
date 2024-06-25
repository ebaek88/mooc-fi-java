

import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase Suitcase) {
        if (this.totalWeight() + Suitcase.totalWeight() > maximumWeight) {
            return;
        }

        this.suitcases.add(Suitcase);
    }

    public int totalWeight() {
        // int summa = 0;
        // int indeksi = 0;
        // while (indeksi < this.suitcases.size()) {
        // summa += this.suitcases.get(indeksi).totalWeight();
        // indeksi++;
        // }

        // Using stream instead of while loop to compute the total weight of the Suitcases in a Hold
        int summa = this.suitcases.stream()
                                  .map(Suitcase::totalWeight)
                                  .reduce(0, (x, y) -> x + y);
        return summa;
    }

    public void printItems() {
        // int indeksi = 0;
        // while (indeksi < this.suitcases.size()) {
        // this.suitcases.get(indeksi).printItems();
        // indeksi++;
        // }

        // Using stream instead of while loop to print all the items in a Suitcase
        this.suitcases.stream()
                  .forEach(Suitcase::printItems);
    }

    @Override
    public String toString() {
        if (this.suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }

        if (this.suitcases.size() == 1) {
            return "1 suitcase (" + this.totalWeight() + " kg)";
        }

        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}

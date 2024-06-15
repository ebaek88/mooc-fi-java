import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> giftPackage;

    public Package() {
        giftPackage = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        giftPackage.add(gift);
    }

    public int totalWeight() {
        if(giftPackage.size() == 0) {
            return 0;
        }

        int packageWeight = 0;
        for(Gift element: giftPackage) {
            packageWeight += element.getWeight();
        }

        return packageWeight;
    }
}

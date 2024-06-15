import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> birdList;

    // constructor
    public BirdDatabase() {
        this.birdList = new ArrayList<>();
    }

    // add a bird to the list
    public void addBird(String birdName, String latinName) {
        // first check if the same bird is already there
        if(searchBird(birdName) != null) {
            System.out.println("The bird with the same name is already in the database.");
            return;
        }

        Bird newBird = new Bird(birdName, latinName);
        this.birdList.add(newBird);
    }

    // checks if the bird with the same name is already in the database
    // if yes, returns a Bird object. if no, return null;
    public Bird searchBird(String birdName) {
        for(Bird element: this.birdList) {
            if(element.getBirdName().equals(birdName)) {
                return element;
            }
        }

        return null;
    }

    // increase the observation number of a bird if it is already in the list
    public void observeBird(String birdName) {
        // first check if the same bird is already there
        Bird queryBird = searchBird(birdName);
        if(queryBird == null) {
            System.out.println("Not a bird!");
            return;
        } else {
            queryBird.increaseObservation();
        }
    }

    // list all the birds in the database
    public void listBirds() {
        if(this.birdList.isEmpty()) {
            System.out.println("No bird in the database.");
        }

        for(int i = this.birdList.size() - 1; i >= 0; i--) {
            System.out.println(this.birdList.get(i));
        }
    }

    // find a bird in the database with the search name
    // if yes, print.
    public void findBird(String queryName) {
        if(searchBird(queryName) == null) {
            System.out.println("Not in the database.");
        } else {
            System.out.println(searchBird(queryName));
        }
    }
}

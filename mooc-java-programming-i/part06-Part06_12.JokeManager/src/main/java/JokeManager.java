import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;

    // constructor
    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        // if there is no joke in the list
        if(this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(this.jokes.size());
            return this.jokes.get(index);
        }
    }

    public void printJokes() {
        for(String element: jokes) {
            System.out.println(element);
        }
    }
}

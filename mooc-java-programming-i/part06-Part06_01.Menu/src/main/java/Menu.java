
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal) {
        if(!(this.meals.contains(meal))) {
            this.meals.add(meal);
        }
    }
    
    // prints all the meals in the menu
    public void printMeals() {
        for(String meal: meals) {
            System.out.println(meal);
        }
    }

    // removes all the meals in the menu
    public void clearMenu() {
        this.meals.clear();
    }

    // you don't need to override the equals method for the contains method this time
    // because we are adding String objects in the list, and the equals method for the String class
    // is the one you have been using for comparing the "String contents"

    
}

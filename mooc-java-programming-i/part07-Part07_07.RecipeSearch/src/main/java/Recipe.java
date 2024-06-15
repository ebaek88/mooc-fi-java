import java.util.ArrayList;

public class Recipe {
    private String recipeName;
    private int cookTime;
    private ArrayList<String> ingredientList;

    // constructor
    public Recipe() {
        recipeName = "";
        cookTime = 0;
        ingredientList = new ArrayList<>();
    }

    public Recipe(String name, int time) {
        recipeName = name;
        cookTime = time;
        ingredientList = new ArrayList<>();
    }

    public String getRecipeName() {
        return recipeName;
    }

    public int getCookTime() {
        return cookTime;
    }

    public void setRecipeName(String str) {
        recipeName = str;
    }

    public void setCookTime(int number) {
        cookTime = number;
    }

    public ArrayList<String> getIngredientList() {
        return ingredientList;
    }

    public String toString() {
        return this.recipeName + ", cooking time: " + this.cookTime;
    }
}

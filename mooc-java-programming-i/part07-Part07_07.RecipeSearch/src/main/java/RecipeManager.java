import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeManager {
    private ArrayList<Recipe> recipeList;

    public RecipeManager() {
        recipeList = new ArrayList<>();
    }

    public void add(Recipe recipe) {
        recipeList.add(recipe);
    }

    public void readFromFile(String path) {

        // start reading from the file
        try(Scanner scan = new Scanner(Paths.get(path))) {
            while(scan.hasNextLine()) {
                
                Recipe element = new Recipe();

                for(int i = 0; ;i++) {
                    if(!scan.hasNextLine()) {
                        break;
                    }

                    String line = scan.nextLine();
                    if(line.isEmpty()) {
                        break;
                    }
                    
                    // first line always the name
                    if(i == 0) {
                        element.setRecipeName(line);
                    } else if(i == 1) { // second line of the recipe is always a number
                        element.setCookTime(Integer.valueOf(line));
                    } else {
                        element.getIngredientList().add(line);
                    }

                }

                recipeList.add(element);
            }

        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        
    }

    // list all the recipes in the list
    public void listRecipe() {
        System.out.println("Recipes:");

        for(Recipe element: recipeList) {
            System.out.println(element);
        }
    }

    // search by words in a recipe
    public void showRecipe(String searchWord) {
        for(Recipe element: recipeList) {
            if(element.getRecipeName().contains(searchWord)) {
                System.out.println(element);
            }
        }
    }

    // list all the recipes that have less than the searched cook time
    public void searchByCookTime(int queryTime) {
        for(Recipe element: recipeList) {
            if(element.getCookTime() <= queryTime) {
                System.out.println(element);
            }
        }
    }
    
    // list all the recipes that contain the searched ingredient
    public void searchByIngredient(String queryIngredient) {
        for(Recipe element: recipeList) {
            if(element.getIngredientList().contains(queryIngredient)) {
                System.out.println(element);
            }
        }
    }
}

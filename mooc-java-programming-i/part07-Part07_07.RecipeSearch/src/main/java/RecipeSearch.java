
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeManager manager = new RecipeManager();

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        manager.readFromFile(fileName);


        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println();
        while(true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            
            if(command.equals("stop")) {
                break;
            }

            if(command.equals("list")) {
                manager.listRecipe();
            }

            if(command.equals("find name")) {
                System.out.print("Searched word: ");
                String query = scanner.nextLine();
                System.out.println("Recipes:");
                manager.showRecipe(query);
            }

            if(command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int queryTime = Integer.valueOf(scanner.nextLine());
                System.out.println("Recipes:");
                manager.searchByCookTime(queryTime);
            }

            if(command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println("Recipes:");
                manager.searchByIngredient(ingredient);
            }

            System.out.println();
        }


    }

}

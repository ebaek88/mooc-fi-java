
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // creates item using Item class. Terminates when an empty line is read.
        while(true) {
            System.out.print("Name: ");
            String itemName = scanner.nextLine();
            if(itemName.isEmpty()) {
                break;
            }

            items.add(new Item(itemName));
        }

        // prints out the names of Item usimg toString
        for(Item element: items) {
            System.out.println(element);
        }
    }
}

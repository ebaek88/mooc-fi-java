
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Item> itemList = new ArrayList<>();

        // add items to the list. the process will stop
        // when an empty line is entered.
        while(true) {
            System.out.println("Identifier? (empty will stop)");
            String inputId = scanner.nextLine();
            if(inputId.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String inputName = scanner.nextLine();
            if(inputName.isEmpty()) {
                break;
            }

            Item itemInTheList = new Item(inputId, inputName);

            // if the item with the same identifier is already in the list,
            // the new item is not added to the list
            if(itemList.contains(itemInTheList)) {
                continue;
            }

            itemList.add(itemInTheList);
        }

        System.out.println("==Items==");
        
        // prints out the elements in the list
        for(Item element : itemList) {
            System.out.println(element);
        }
    }
}

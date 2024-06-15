
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        // implement finding the greatest number in the list here
        int greatestIndex = 0;
        for(int i = 1; i < list.size(); i++) {
            if(list.get(greatestIndex) < list.get(i)) {
                greatestIndex = i;
            }
        }

        System.out.println("The greatest number: " + list.get(greatestIndex));
    }
}


import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        ArrayList<Integer> intList = new ArrayList<>();

        while(true) {
            int element = Integer.valueOf(scanner.nextLine());
            if(element == -1) {
                break;
            }

            intList.add(element);
        }
        System.out.println("");

        // Then it computes the average of the numbers on the list
        // and prints it.
        int sum = 0, count = 0;
        for(Integer arrayElm: intList) {
            sum += arrayElm;
            count++;
        }

        System.out.println("Average: " + (double)sum / count);
    }
}

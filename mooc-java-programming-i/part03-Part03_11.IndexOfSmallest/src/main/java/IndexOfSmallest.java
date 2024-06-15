
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> intList = new ArrayList<>();
        while(true) {
            int input = Integer.valueOf(scanner.nextLine()) ;
            if(input == 9999) {
                break;
            }

            intList.add(input);
        }
        System.out.println("");

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        // first, find and print the smallest number of the list
        int small = intList.get(0);
        for(int i = 1; i < intList.size(); i++) {
            if(intList.get(i) < small) {
                small = intList.get(i);
            }
        }
        System.out.println("Smallest number: " + small);

        // then, find and print the indexes that contain the number
        for(int j = 0; j < intList.size(); j++) {
            if(intList.get(j) == small) {
                System.out.println("Found at index: " + j);
            }
        }
        

    }
}

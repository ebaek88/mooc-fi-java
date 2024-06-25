
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

  public static void main(String[] args) {
    List<Integer> intList = new ArrayList<>(); // List for storing inputs
    Scanner scanner = new Scanner(System.in); // Scanner opened
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());  // takes input as int
            if(input < 0) {
              break;  // If the input is negative it exits the loop
            }
            intList.add(input); // Otherwise, the input is added to the list
        }

        // Filter out the numbers between 1 and 5 of the list by Stream operations
        // and print out the results line by line
        List<Integer> result = intList
            .stream()
            .filter(e -> e >= 1 && e <= 5)
            .collect(Collectors.toList());
        for(Integer element : result) {
          System.out.println(element);
        }

        // Alternative solution :
        // intList.stream()
        //       .filter(e -> e >=1 && e <= 5)
        //       .forEach(System.out::println);

    }//main
}//class

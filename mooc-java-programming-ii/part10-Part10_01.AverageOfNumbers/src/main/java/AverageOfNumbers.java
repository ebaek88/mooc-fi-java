
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        List<String> numberList = new ArrayList<>(); //list for storing numbers
        
        //starts the loop to store numbers in the list
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("end")) {
                break;
            }

            numberList.add(input);
        }

        //calculating the average of numbers in the list using stream
        //for stream, you don't put access modifier...?
        double average = numberList.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .average()
            .getAsDouble();

        // printing the average
        System.out.println("average of the numbers: " + average);

    }
}

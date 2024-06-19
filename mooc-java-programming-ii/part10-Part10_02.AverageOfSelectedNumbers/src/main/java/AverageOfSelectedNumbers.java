
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> numberList = new ArrayList<>(); //list for storing numbers
        
        //starts the loop to store numbers in the list
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("end")) {
                break;
            }

            numberList.add(input);
        }//while

        double average = 0; // variable for storing the averages
        String option;

        while(true) {
            //ask to choose the option : the average of the negative numbers or the positive numbers
            System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
            option = scanner.nextLine();
            
            //if n is entered, calculate the average of the negative numbers
            if(option.equals("n")) {
                average = numberList.stream()
                    .mapToInt(element -> Integer.valueOf(element))
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();

                break;
            } else if(option.equals("p")) { //if p is entered, calculate the average of the positive numbers
                average = numberList.stream()
                    .mapToInt(element -> Integer.valueOf(element))
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble();

                break;
            } else {
                System.out.println("Please select the correct option.");
                continue;
            }

        }//while

        //print the average
        System.out.println("Average of the " + (option.equals("n") ? "negative" : "positive") + " numbers: " + average);

    }//main
}//class

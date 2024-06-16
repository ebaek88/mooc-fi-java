
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int posiSum = 0; // variable for storing the sum of positive numbers put in
        int posiCount = 0; // number of positive numbers put in

        while(true) {
            input = scanner.nextInt();
            if(input == 0) {
                break;
            }
            
            if(input > 0) {
                posiSum += input;
                posiCount++;
            }
        }

        if(posiCount == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(1.0 * posiSum / posiCount);
        }
    }
}

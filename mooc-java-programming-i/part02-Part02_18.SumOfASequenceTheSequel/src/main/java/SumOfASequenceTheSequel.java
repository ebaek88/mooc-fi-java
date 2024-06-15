
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number? ");
        int initVal = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        int termVal = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        
        while(initVal <= termVal) {
            sum += initVal;
            initVal++;
        }

        System.out.println("The sum is " + sum);

    }
}

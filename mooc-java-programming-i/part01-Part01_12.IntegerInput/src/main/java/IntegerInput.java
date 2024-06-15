
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        int inputVal;
        System.out.println("Give a number:");
        inputVal = Integer.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + inputVal);

    }
}

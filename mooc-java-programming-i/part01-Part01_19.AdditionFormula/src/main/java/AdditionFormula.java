
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give the first number:");
        int input1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int input2 = Integer.valueOf(scanner.nextLine());
        System.out.println(input1 + " + " + input2 + " = " + (input1 + input2));
    }
}

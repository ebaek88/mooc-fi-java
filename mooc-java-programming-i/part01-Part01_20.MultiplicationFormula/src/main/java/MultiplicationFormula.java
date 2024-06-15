
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int operand1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int operand2 = Integer.valueOf(scanner.nextLine());
        System.out.println(operand1 + " * " + operand2 + " = " + (operand1 * operand2));
    }
}

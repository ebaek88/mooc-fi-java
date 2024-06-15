
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int intVal1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int intVal2 = Integer.valueOf(scanner.nextLine());

        System.out.println(intVal1 + " + " + intVal2 + " = " + (intVal1 + intVal2));
        System.out.println(intVal1 + " - " + intVal2 + " = " + (intVal1 - intVal2));
        System.out.println(intVal1 + " * " + intVal2 + " = " + (intVal1 * intVal2));
        System.out.println(intVal1 + " / " + intVal2 + " = " + ((double)intVal1 / intVal2));
    }
}

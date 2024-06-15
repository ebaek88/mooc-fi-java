
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int input = Integer.valueOf(scanner.nextLine());
        int product = 1;
        
        for(int i = input; i > 0; i--) {
            product *= i;
        }

        System.out.println("Factorial: " + product);
    }
}


import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int firstInput = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int secondInput = Integer.valueOf(scan.nextLine());

        if(firstInput > secondInput) {
            System.out.println("Greater number is: " + firstInput);
        } else if(firstInput < secondInput) {
            System.out.println("Greater number is: " + secondInput);
        } else {
            System.out.println("The numbers are equal!");
        }

    }
}

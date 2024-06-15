
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. 
        String firstInput, secondInput;
        System.out.println("Enter the first string:");
        firstInput = scan.nextLine();
        System.out.println("Enter the second string:");
        secondInput = scan.nextLine();

        if(firstInput.equals(secondInput)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

    }
}


import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers should be printed?");
        int numToPrint = scanner.nextInt();
        Random randomGenerator = new Random(); // create Random object
        for (int i = 0; i < numToPrint; i++) {
            int randomNum = randomGenerator.nextInt(11); // create a random integer between 0 and 10
            System.out.println(randomNum);
        }

        scanner.close();
    }

}

import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        boolean inputVal;
        System.out.println("Write something:");
        inputVal = Boolean.valueOf(scanner.nextLine());
        System.out.println("True or false? " + inputVal);
    }
}

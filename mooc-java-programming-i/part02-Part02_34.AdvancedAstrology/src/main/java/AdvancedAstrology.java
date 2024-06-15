
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int stars = 0;
        while(stars < number) {
            System.out.print("*");
            stars++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int spaces = 0;
        while(spaces < number) {
            System.out.print(" ");
            spaces++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for(int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise

        //printing the stars
        int rowStars = 1;
        int starHeight = height;
        while(starHeight > 0){
            printSpaces(starHeight - 1);
            printStars(rowStars);
            rowStars += 2;
            starHeight--;
        }

        //priting the base
        for(int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}

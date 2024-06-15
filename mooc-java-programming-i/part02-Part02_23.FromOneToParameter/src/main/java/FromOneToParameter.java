

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int num) {
        if(num < 1) {
            return;
        } else {
            for(int i = 1; i <= num; i++) {
                System.out.println(i);
            }
        }
    }

}

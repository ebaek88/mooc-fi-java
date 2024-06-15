

public class Division {

    public static void main(String[] args) {
        
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"

        division(3, 1);
    }

    // implement the method here
    public static void division(int number1, int number2) {
        if(number2 == 0) {
            return;
        }
        
        System.out.println((double)number1 / number2);
    }
}

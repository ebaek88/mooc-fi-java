
public class SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        // Write some code here
        int sum = 0;
        //for-each loop works even in a normal array as well as an ArrayList!
        //for(int element: array) {
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}

import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        //start with array[0]
        int smallest = array[0];
        
        for(int element: array) {
            if(element < smallest) {
                smallest = element;
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        //start with array[0]
        int smallestIndex = 0;
        for(int i = 1; i < array.length; i++) {
            if(array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        
        // if startIndex is greater than table.length - 1, return -1
        if(startIndex >= table.length) {
            return -1;
        }
        
        //start with array[startIndex]
        int smallestIndex = startIndex;
        
        for(int i = startIndex + 1; i < table.length; i++) {
            if(table[i] < table[smallestIndex]) {
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        
        // remember the shoestring!
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {

        System.out.println(Arrays.toString(array));

        // you don't need to go through the last index
        for(int i = 0; i < array.length - 1; i++) {
            int swapIndex = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, i, swapIndex);
            System.out.println(Arrays.toString(array));
        }
    }
}
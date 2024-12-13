
import java.util.Arrays;

public class MainProgram {

    public static int smallest(int[] array) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int indexOfSmallest = -1;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                indexOfSmallest = i;
            }
        }

        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexOfSmallestFrom = -1;

        if ((startIndex < 0) || (startIndex >= table.length)) {
            return indexOfSmallestFrom;
        }

        indexOfSmallestFrom = MainProgram.indexOfSmallest(Arrays.copyOfRange(table, startIndex, table.length)) + startIndex;

        return indexOfSmallestFrom;
    }

    public static void swap(int[] array, int index1, int index2) {
        int largestIndex = -1;
        if (index1 >= index2) {
            largestIndex = index1;
        } else {
            largestIndex = index2;
        }

        if (!(largestIndex >= array.length)) {
            int index1Value = array[index1];
            array[index1] = array[index2];
            array[index2] = index1Value;
        }
    }

    public static void sort(int[] array) {
        if (array.length > 1) {
            for (int i = 0; i < (array.length - 1); i++) {
                MainProgram.swap(array, i, MainProgram.indexOfSmallestFrom(array, i));
                System.out.println(Arrays.toString(array));
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(numbers));
        MainProgram.sort(numbers);
    }
}

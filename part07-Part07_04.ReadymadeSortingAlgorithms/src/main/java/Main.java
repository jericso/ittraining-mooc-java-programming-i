
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(numbers));
        Main.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] strings = {"G", "Q", "A", "L", "B", "E"};
        System.out.println(Arrays.toString(strings));
        Main.sort(strings);
        System.out.println(Arrays.toString(strings));

        ArrayList<Integer> numbersArrayList = new ArrayList<>();
        int[] numbers2 = {8, 3, 7, 9, 1, 2, 4};
        for (int i = 0; i < numbers2.length; i++) {
            numbersArrayList.add(numbers2[i]);
        }
        System.out.println(numbersArrayList);
        Main.sortIntegers(numbersArrayList);
        System.out.println(numbersArrayList);
        
        ArrayList<String> stringsArrayList = new ArrayList<>();
        String[] strings2 = {"G", "Q", "A", "L", "B", "E"};
        for (int i = 0; i < strings2.length; i++) {
            stringsArrayList.add(strings2[i]);
        }
        System.out.println(stringsArrayList);
        Main.sortStrings(stringsArrayList);
        System.out.println(stringsArrayList);      
    }
}

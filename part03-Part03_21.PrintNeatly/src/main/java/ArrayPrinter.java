
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        int index = 0;
        String output = "";
        while (index < array.length) {
            output = output + array[index];
            index++;
            if (index < array.length) {
                output = output + ", ";
            }
        }

        System.out.println(output);
        return;
    }
}

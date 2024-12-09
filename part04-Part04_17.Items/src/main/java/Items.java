
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name: ");
        String itemInput = scanner.nextLine();
        while (!itemInput.isEmpty()) {
            items.add(new Item(itemInput));

            System.out.println("Name: ");
            itemInput = scanner.nextLine();
        }

        for (Item item : items) {
            System.out.println(item);
        }
    }
}

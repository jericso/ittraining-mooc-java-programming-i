
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Item> items = new ArrayList<>();
        Item item;
        String identifier;
        String name;
        
        System.out.println("Identifier? (empty will stop)");
        identifier = scanner.nextLine();
        while (!identifier.isEmpty()) {
            System.out.println("Name? (empty will stop)");
            name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            item = new Item(identifier, name);
            if (!items.contains(item)) {
                items.add(item);
            }
            
            System.out.println("Identifier? (empty will stop)");
            identifier = scanner.nextLine();
        }
        
        System.out.println("==Items==");
        for (Item listItem : items) {
            System.out.println(listItem);
        }
    }
}

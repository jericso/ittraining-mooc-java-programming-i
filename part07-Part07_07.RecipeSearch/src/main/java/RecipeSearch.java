
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read: ");
        String fileName = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            Cookbook cookbook = new Cookbook(fileScanner);
            UserInterface ui = new UserInterface(cookbook, scanner);
            ui.start();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

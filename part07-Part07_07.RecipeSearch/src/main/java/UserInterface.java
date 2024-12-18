
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {

    private Cookbook cookbook;
    private Scanner scanner;

    public UserInterface(Cookbook cookbook, Scanner scanner) {
        this.cookbook = cookbook;
        this.scanner = scanner;
    }

    private void printMenu() {
        System.out.println();
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println();
    }

    private void printRecipes(ArrayList<Recipe> recipes) {
        System.out.println();
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
        System.out.println();
    }

    private void listRecipes() {
        this.printRecipes(this.cookbook.getRecipes());
    }

    private void findRecipesByName() {
        String searchedWord = "";
        System.out.println("Searched word:");
        searchedWord = this.scanner.nextLine();

        this.printRecipes(this.cookbook.getRecipesByName(searchedWord));
    }

    private void findRecipesByMaximumCookingTime() {
        int maximumCookingTime = 0;
        System.out.println("Max cooking time:");
        maximumCookingTime = Integer.parseInt(this.scanner.nextLine());

        this.printRecipes(this.cookbook.getRecipesByMaximumCookTime(maximumCookingTime));
    }

    private void findRecipesByIngredient() {
        String ingredient = "";
        System.out.println("Ingredient:");
        ingredient = this.scanner.nextLine();

        this.printRecipes(this.cookbook.getRecipesByIngredient(ingredient));
    }

    public void start() {
        String command = "";

        this.printMenu();

        System.out.println("Enter command:");
        command = this.scanner.nextLine();
        while (!command.equals("stop")) {
            if (command.equals("list")) {
                this.listRecipes();
            } else if (command.equals("find name")) {
                this.findRecipesByName();
            } else if (command.equals("find cooking time")) {
                this.findRecipesByMaximumCookingTime();
            } else if (command.equals("find ingredient")) {
                this.findRecipesByIngredient();
            }

            System.out.println("Enter command:");
            command = this.scanner.nextLine();
        }
    }
}

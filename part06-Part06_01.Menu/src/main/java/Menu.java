
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // Adds a meal to the menu. If the meal is already on the list, it should 
    // not be added again.
    public void addMeal(String meal) {
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }

    //  Prints the meals.
    public void printMeals() {
        for (String meal : this.meals) {
            System.out.println(meal);
        }
    }

    //  Clears the menu.
    public void clearMenu() {
        this.meals.clear();
    }
}

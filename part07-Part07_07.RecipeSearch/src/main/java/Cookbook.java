
import java.util.Scanner;
import java.util.ArrayList;

public class Cookbook {

    private Scanner fileScanner;
    private ArrayList<Recipe> recipes;

    public Cookbook(Scanner fileScanner) {
        this.fileScanner = fileScanner;
        this.recipes = new ArrayList<>();

        String recipeName = "";
        int cookTime = 0;
        String ingredient = "";
        ArrayList<String> ingredientList;
        Recipe recipe;
        while (this.fileScanner.hasNextLine()) {
            recipeName = this.fileScanner.nextLine();
            cookTime = Integer.parseInt(this.fileScanner.nextLine());

            ingredientList = new ArrayList<>();
            ingredient = this.fileScanner.nextLine();
            while (this.fileScanner.hasNextLine() && !ingredient.equals("")) {
                ingredientList.add(ingredient);
                ingredient = this.fileScanner.nextLine();
            }

            recipe = new Recipe(recipeName, cookTime, ingredientList);
            this.recipes.add(recipe);
        }
    }

    public ArrayList<Recipe> getRecipes() {
        return this.recipes;
    }

    public ArrayList<Recipe> getRecipesByName(String recipeNameSearch) {
        ArrayList<Recipe> returnRecipes = new ArrayList<>();

        for (Recipe recipe : this.recipes) {
            if (recipe.getName().contains(recipeNameSearch)) {
                returnRecipes.add(recipe);
            }
        }

        return returnRecipes;
    }

    public ArrayList<Recipe> getRecipesByMaximumCookTime(int maximumCookingTimeSearch) {
        ArrayList<Recipe> returnRecipes = new ArrayList<>();

        for (Recipe recipe : this.recipes) {
            if (recipe.getCookTime() <= maximumCookingTimeSearch) {
                returnRecipes.add(recipe);
            }
        }

        return returnRecipes;
    }

    public ArrayList<Recipe> getRecipesByIngredient(String ingredientSearch) {
        ArrayList<Recipe> returnRecipes = new ArrayList<>();

        for (Recipe recipe : this.recipes) {
            for (String ingredient : recipe.getIngredients()) {
                if (ingredient.equals(ingredientSearch)) {
                    returnRecipes.add(recipe);
                    break;
                }
            }
        }

        return returnRecipes;
    }
}

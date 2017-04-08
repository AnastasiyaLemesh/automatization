package task2.subtask1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Created by Anastasiya_Lemesh on 2/21/2017.
 */
public class Salad {

    private ArrayList<Vegetable> ingredients = new ArrayList<Vegetable>();

    public void addIngredient(Vegetable vegetable) {
        ingredients.add(vegetable);
    }

    public int calcTotalCalorific() {
        int totalCalorific = 0;
        for (Vegetable ingredient : ingredients) {
            totalCalorific += ingredient.calcCalorific();
        }
        return totalCalorific;
    }

    public void sortByName() {
        System.out.println("Ingredients before sorting by name");
        for (Vegetable ingredient : ingredients) {
            System.out.println(ingredient.getName());
        }
        System.out.println();
        Collections.sort(ingredients, new VegetableNameComparator());
        System.out.println("Ingredients after sorting by name");
        for (Vegetable ingredient : ingredients) {
            System.out.println(ingredient.getName());
        }
    }

    public List<Vegetable> getFromRange(double lowerBound, double upperBound) {
        ArrayList<Vegetable> vegetables = new ArrayList<>();
        for (Vegetable ingredient : ingredients) {
            if (ingredient.getWeight() > lowerBound && ingredient.getWeight() < upperBound) {
                vegetables.add(ingredient);
            }
        }
        return vegetables;
    }
}

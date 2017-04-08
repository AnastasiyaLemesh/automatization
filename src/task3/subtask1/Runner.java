package task3.subtask1;

import task2.subtask1.*;

import java.io.*;
import java.util.List;

/**
 * Created by Anastasiya_Lemesh on 2/21/2017.
 */
public class Runner {

    public static void main(String[] args) {

        Cabbage cabbage = new Cabbage(50);
        Carrot carrot = new Carrot(100);
        Cucumber cucumber = new Cucumber(30);
        Potato potato = new Potato(23);
        Tomato tomato = new Tomato(234);

        Salad salad = new Salad();
        salad.addIngredient(potato);
        salad.addIngredient(cabbage);
        salad.addIngredient(tomato);
        salad.addIngredient(carrot);
        salad.addIngredient(cucumber);

        try {
            System.out.println("Total calorific: " + salad.calcTotalCalorific());
        } catch (IngredientsNotFoundException e) {
            System.out.println("Couldn't calculate calorific: " + e.getMessage());
        }

        salad.sortByName();

        System.out.println();
        System.out.println("Ingredients from range:");
        List<Vegetable> vegetables = salad.getFromRange(1, 55);
        for (Vegetable ingredient : vegetables) {
            System.out.println(ingredient.getName());
        }

    }
}

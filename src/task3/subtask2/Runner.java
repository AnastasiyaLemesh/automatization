package task3.subtask2;

import java.io.*;
import java.util.List;

/**
 * Created by Anastasiya_Lemesh on 2/21/2017.
 */
public class Runner {

    public static void main(String[] args){
        String fileName = "resources/chef.txt";
        String fileName1 = "result/task3/result.txt";
        File file = new File(fileName);

        String s;
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(file));
            s = in.readLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

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
        System.out.println();
        if (s.equals("name")){
            salad.sortByName();
        } else if (s.equals("weight")){
            salad.sortByWeight();
        }

        //write in file
        File file1 = new File(fileName1);
        try {
            if(!file1.exists()){
                file1.createNewFile();
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }

        PrintWriter out = null;
        try {
            out = new PrintWriter(file1);
            out.println("Ranged by weight: " );
            List<Vegetable> vegetables = salad.getFromRange(1, 55);
            for (Vegetable ingredient : vegetables) {
                out.println(ingredient.getName());
            }

        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } finally {
                out.close();
            System.out.println();
        }
    }
}

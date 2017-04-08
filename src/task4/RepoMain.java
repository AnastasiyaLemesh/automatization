package task4;

import java.io.*;
import java.util.List;

/**
 * Created by TTN on 05.04.2017.
 */
public class RepoMain {

    public static void main(String[] args) {
        Repository repository;

        String fileName = "resources/source.txt";
        String fileName1 = "result/task4/result.txt";
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

        switch (s) {
            case "db" : {
                repository = new PostgresRepository();
                break;
            }
            case "xml" : {
                repository = new XmlRepository();
                break;
            }
            default: {
                throw new RuntimeException("Source is not valid");
            }
        }

        Salad salad = new Salad();
        salad.addIngredients(repository.getVegetables());

        try {
            System.out.println("Total calorific: " + salad.calcTotalCalorific());
        } catch (IngredientsNotFoundException e) {
            System.out.println("Couldn't calculate calorific: " + e.getMessage());
        }

        System.out.println();
        salad.sortByName();

        //write in file
        File file1 = new File(fileName1);
        try {
            if(!file1.exists()){
                file1.createNewFile();
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }

        PrintWriter out = null;
        try {
            out = new PrintWriter(file1);
            out.println("Ranged by weight: " );
            List<Vegetable> vegetables = salad.getFromRange(1, 20);
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

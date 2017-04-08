package task3.subtask2;

/**
 * Created by Anastasiya_Lemesh on 2/21/2017.
 */
public class Tomato extends AbstractVegetable {

    private int calories = 90;
    private String name = "Tomato";

    public Tomato(int weight) {
        super(weight);
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

}

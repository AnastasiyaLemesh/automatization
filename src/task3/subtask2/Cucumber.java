package task3.subtask2;

/**
 * Created by Anastasiya_Lemesh on 2/21/2017.
 */
public class Cucumber extends AbstractVegetable {

    private int calories = 80;
    private String name = "Cucumber";

    public Cucumber(int weight) {
        super(weight);
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

}

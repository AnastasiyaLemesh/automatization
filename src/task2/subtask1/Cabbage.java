package task2.subtask1;

/**
 * Created by Anastasiya_Lemesh on 2/21/2017.
 */
public class Cabbage extends AbstractVegetable {

    private int calories = 100;

    private String name = "Cabbage";

    public Cabbage(int weight) {
        super(weight);
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public String getName() {
        return name;
    }

}

package task3.subtask1;

/**
 * Created by Anastasiya_Lemesh on 2/21/2017.
 */
public class Carrot extends AbstractVegetable {

    private int calories = 60;
    private String name = "Carrot";

    public Carrot(int weight) {
        super(weight);
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

}

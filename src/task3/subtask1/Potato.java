package task3.subtask1;

/**
 * Created by Anastasiya_Lemesh on 2/21/2017.
 */
public class Potato extends AbstractVegetable {

    private int calories = 150;
    private String name = "Potato";

    public Potato(int weight) {
        super(weight);
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

}

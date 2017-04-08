package task3.subtask2;

/**
 * Created by Anastasiya_Lemesh on 2/21/2017.
 */
public abstract class AbstractVegetable implements Vegetable {

    private int weight;

    public AbstractVegetable(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int calcCalorific() {
        if (weight <= 0){
            throw new InvalidWeightException("Weight can not be <= 0");
        }
        return getCalories() * (weight / 100);
    }

    public abstract int getCalories();

}

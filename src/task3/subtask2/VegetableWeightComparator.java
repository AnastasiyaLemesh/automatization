package task3.subtask2;

import java.util.Comparator;

/**
 * Created by TTN on 26.02.2017.
 */
public class VegetableWeightComparator implements Comparator<Vegetable> {

    @Override
    public int compare(Vegetable o1, Vegetable o2) {
        return o1.getWeight()-o2.getWeight();
    }
}

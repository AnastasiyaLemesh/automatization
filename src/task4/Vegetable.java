package task4;

/**
 * Created by TTN on 05.04.2017.
 */
public class Vegetable {

    private Integer id;

    private String name;

    private Integer colories;

    private Integer weight;

    public Vegetable(Integer id, String name, Integer colories, Integer weight) {
        this.id = id;
        this.name = name;
        this.colories = colories;
        this.weight = weight;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getColories() {
        return colories;
    }

    public Integer getWeight() {
        return weight;
    }

    public int calcCalorific() {
        if (weight <= 0){
            throw new InvalidWeightException("Weight can not be <= 0");
        }
        return colories * (weight / 100);
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", colories=" + colories +
                ", weight=" + weight +
                '}';
    }

}

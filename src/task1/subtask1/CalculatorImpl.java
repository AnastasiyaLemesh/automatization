package task1.subtask1;

/**
 * Created by TTN on 07.02.2017.
 */
public class CalculatorImpl implements Calculator {

    @Override
    public void sum(int num1, int num2) {
        System.out.println("Result: " + (num1 + num2));
    }

    @Override
    public void subtract(int num1, int num2) {
        System.out.println("Result: " + (num1 - num2));
    }

    @Override
    public void multiply(int num1, int num2) {
        System.out.println("Result: " + num1 * num2);
    }

    @Override
    public void divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("ERROR!");
        } else {
            System.out.println("Result: " + num1 / num2);
        }

    }
}

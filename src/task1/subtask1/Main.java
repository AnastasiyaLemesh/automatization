package task1.subtask1;

import java.util.Scanner;
/**
 * Created by TTN on 07.02.2017.
 */
public class Main {
    
    public static void main(String[] args) {
        Calculator calc = new CalculatorImpl();

        while (true) {
            int num1;
            int num2;
            String operation;
            Scanner in = new Scanner(System.in);
            System.out.print("Enter num1: ");
            num1 = in.nextInt();
            System.out.print("Enter operation (+, -, /, *): ");
            operation = in.next();
            System.out.print("Enter num2: ");
            num2 = in.nextInt();

            if (operation.equals("+")) {
                calc.sum(num1, num2);
            }

            if (operation.equals("-")) {
                calc.subtract(num1, num2);
            }

            if (operation.equals("/")) {
                calc.divide(num1, num2);
            }

            if (operation.equals("*")) {
                calc.multiply(num1, num2);
            }

        }
    }
    
}

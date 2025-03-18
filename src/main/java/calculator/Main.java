//Abraham Kassa

package src.main.java.calculator;

import src.main.java.calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum = calculator.add(5, 3);
        System.out.println("5 + 3 = " + sum);

    }
}
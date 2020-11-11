package ge.edu.calculator;

import ge.edu.calculator.service.impl.CalculatorServiceImpl;

public class Main {
    public static void main(String[] args) {
        CalculatorServiceImpl test = new CalculatorServiceImpl();
        test.divide(10,2);
        test.divide(10.5,1.75);
        test.sum(10,60);
        test.sum(189,70.6879);
    }
}

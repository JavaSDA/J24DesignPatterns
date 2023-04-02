package com.company.advancedCoding.calc;

public class Calculator {
    public static double add(double a, double b) {
        MathOperation addition = (x, y) -> x + y;
        return performCalculation(a, b, addition);
    }

    public static double subtract(double a, double b) {
        return performCalculation(a, b, (x, y) -> x - y);
    }

    public static double multiply(double a, double b) {
        return performCalculation(a, b, (x, y) -> x * y);
    }

    public static double divide(double a, double b) {
        return performCalculation(a, b, (x, y) -> x / y);
    }

    // helper method
    private static double performCalculation(double a, double b, MathOperation operation) {
        return operation.operate(a, b);
    }
}

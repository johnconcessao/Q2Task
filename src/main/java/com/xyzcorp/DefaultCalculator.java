package com.xyzcorp;


public class DefaultCalculator implements Calculator {


    @Override
    public double add(double number1, double number2) {
        return number1 + number2;
    }

    @Override
    public double subtract(double number1, double number2) {
        return number1 - number2;
    }

    @Override
    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    @Override
    public double divide(double number1, double number2) {
        if (number2 == 0) {
            throw new ArithmeticException();
        }
        return number1 / number2;

    }
}


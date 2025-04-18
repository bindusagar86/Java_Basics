package com.bbtech.solidPrinciple.ocp;

public class TestCalculator {

    public static void main(String[] args) {
        Common common = new Common(15d, 5d);
        Addition addition = new Addition(common);
        Substraction substraction = new Substraction(common);

        Calculator calculator = new Calculator();
        calculator.calculate(addition);
        calculator.calculate(substraction);

        System.out.println("Addition: "+ addition.getResult());
        System.out.println("Subtraction: "+ substraction.getResult());
    }
}

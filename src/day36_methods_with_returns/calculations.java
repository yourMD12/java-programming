package day36_methods_with_returns;

import day06_arithmetic_operators.CalculateAge;

public class calculations {
    public static void main(String[] args) {

        System.out.println("add 10 + 45 = " + Calculator.add(10,45));
        System.out.println("100 - 40 = " + Calculator.minus(100,40));
        System.out.println("55 / 4 = " + Calculator.divide(55,4));
        System.out.println("10 * 2 = " + Calculator.multiply(10,2));

        double d1 = 234.5;
        double d2 = 321.5;
        double result = Calculator.minus(d1,d2);
        System.out.println(result);

    }
}

package day36_methods_with_returns;

public class Calculator {

    public static void main(String[] args) {

        System.out.println(add(5.2, 20.0)); //25.2
        double result = add(1,3);
        System.out.println("sum: " + result); //4.0
        System.out.println("100 + 200 = " + add(100,200)); //300.0
        System.out.println();
        System.out.println(minus(10,3)); //7.0
        System.out.println();
        System.out.println(multiply(2,5)); //10.0
        System.out.println();
        System.out.println(divide(15,3)); //5.0



    }
    public static double add(double num1, double num2){
        double sum = num1 + num2;
        return sum; // return num1+num2;
    }
    public static double minus(double num1, double num2){
        double result = num1-num2;
        return result;
    }
    public static double multiply(double num1, double num2){
        double result = num1* num2;
        return result;
    }
    public static double divide(double num1, double num2){
        double result = num1 / num2;
        return result;
    }

}

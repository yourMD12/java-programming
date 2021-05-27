package day14_multi_branch_if_statements;
public class CalculatorV1{
    public static void main(String[] args) {
        double num1 = 5.5;
        double num2 = 2.5;
        char operator = '+';
        if(operator == '+'){
            System.out.println(num1 + num2);
        }else if(operator == '-'){
            System.out.println(num1 - num2);
        }else if(operator == '*'){
            System.out.println(num1 * num2);
        }else if(operator == '/'){
            System.out.println(num1 / num2);
        }else{
            System.out.println("invalid operator");
        }


    }
}
//import java.util.Scanner;
//public class CalculatorV1 {
//    public static void main(String[] args) {
//        // num1, num2, char operator -, = * /
//        // if +: num1+num2
//        // if -: num1-num2 etc + any other "invalid operator"
//        Scanner scan = new Scanner(System.in);
//        double num1 = scan.nextDouble();
//        double num2 = scan.nextDouble();
//        char operator;
//        if(operator == '+'){
//            System.out.println(num1 + num2);
//        }else if(operator == '-'){
//            System.out.println(num1 - num2);
//        }else if(operator == '*'){
//            System.out.println(num1 * num2);
//        }else if(operator == '/'){
//            System.out.println(num1 / num2);
//        }else{
//            System.out.println("Invalid operator");
//        }
package day14_multi_branch_if_statements;
import java.util.Scanner;
public class CalculatorV2 {
    public static void main(String[] args) {
        // num1, num2, char operator -, = * /
        // if +: num1+num2
        // if -: num1-num2 etc + any other "invalid operator"
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1 and num2:");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        System.out.println("Enter operator: ");
        char operator = scan.next().charAt(0);
        if(operator == '+'){
            System.out.println(num1 + num2);
       }else if(operator == '-'){
            System.out.println(num1 - num2);
        }else if(operator == '*'){
            System.out.println(num1 * num2);
        }else if(operator == '/'){
           System.out.println(num1 / num2);
     }else{
            System.out.println("Invalid operator");
       }
    }
}
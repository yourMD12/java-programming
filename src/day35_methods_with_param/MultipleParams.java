package day35_methods_with_param;
import java.util.Scanner;
public class MultipleParams {
    public static void main(String[] args) {
        showSum(15,4);
        Scanner scan = new Scanner(System.in);
        System.out.println("enter 2 number:");
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();
        showSum(d1,d2);
        System.out.println();


    }
    public static void showSum(double num1, double num2 ){
        double sum = num1 + num2;
        System.out.println(sum);

    }
}

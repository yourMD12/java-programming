package day09_scanner_practice;

import java.util.Scanner;

public class addNumbers {
    public static void main ( String[] args){
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter to numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Result: " + num1 + num2);
        System.out.println();
        System.out.println();
        System.out.println("Enter to numbers:");
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();
        int result = num3 + num4;
        System.out.println("Result: " + result);


    }
    //5, 4 result 9
    // Enter 2 numbers, using scanner input 2 int numbers. num1 = scan.nextInt();
}

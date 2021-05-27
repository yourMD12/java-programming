package day10_shorthand_operators;

import java.util.Scanner;

public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rent and month:");
        double rent = scan.nextDouble();
        scan.nextLine(); //LIKE HERE FOR FIXING, work-around
        String month = scan.nextLine();
        System.out.println("month = " + rent);
        System.out.println("month = " + month); // U CAN'T PRINT IN MONTH BECAUSE ITS GLITCH
        //FOR WORK U NEED TO TYPE scan.nextLine BY ITSELF(LOOK UP)

    }
}

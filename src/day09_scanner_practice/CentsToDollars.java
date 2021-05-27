package day09_scanner_practice;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
      Scanner scan = new Scanner( System.in);
        System.out.println("Enter cents: ");
        int cents = scan.nextInt();
        int dollars = cents / 100;
        int remainingCents = cents % 100;
        System.out.println("Cents: " + cents);
        System.out.println("Dollars: " + dollars);
        System.out.println("Remaining cents: " + remainingCents);
        System.out.println("In " + cents + " cents: " + dollars + " dollar " + remainingCents + " cents " );



 //       int cents =123;
 //       int dollars = cents / 100;
  //      int remainingCents = cents % 100;
  //      //in 123 cents: 1 dollar 23 cents
//        System.out.println("In " + cents + " cents: " + dollars + " dollar " + remainingCents + " cents " );

    }
}

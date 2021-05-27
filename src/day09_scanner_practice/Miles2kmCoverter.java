package day09_scanner_practice;

import java.util.Scanner;

public class Miles2kmCoverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter miles: ");
        double miles = scan.nextDouble();
        double milesInKm = miles * 1.609;
        System.out.println(miles + " miles in kilometres: " + milesInKm);



    }
}

//miles,kilometers. Enter miles: 10, 10miles in km: 16.0934
// formula miles * 1.609
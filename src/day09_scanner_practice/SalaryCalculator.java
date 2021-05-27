package day09_scanner_practice;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main ( String [] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter hourly rate: ");
        double rateHourly = scan.nextDouble();
        System.out.println("Enter hourly week: ");
        int weeklyHourly = scan.nextInt();
         double weeklyPay = weeklyHourly * rateHourly;
            double monthlyPay = weeklyPay * 52/12;// weeklyPay might be not accurate, better use weeklyPay * 52/12
            double annualPay = 12 * monthlyPay;
            System.out.println("Weekly pay: " + weeklyPay);
            System.out.println("Monthly pay: " + monthlyPay);
            System.out.println("Annual pay: " + annualPay);






    //    System.out.println("Enter hourly rate: ");
    //    int weeklyHours = 40;
    //    double rateHourly = 50;/  double weeklyPay = weeklyHours * rateHourly;
    //    double monthlyPay = weeklyPay * 52/12;// weeklyPay might be not accurate, better use weeklyPay * 52/12
    //    double annualPay = 12 * monthlyPay;
    //    System.out.println("Weekly pay: " + weeklyPay);
    //    System.out.println("Monthly pay: " + monthlyPay);
    //    System.out.println("Annual pay: " + annualPay);



    }
}
//enter Hourly rate  50. calculate: weeklyPay, monthlyPay, annualPay. WeeklyHours 40
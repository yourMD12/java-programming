package day09_scanner_practice;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter speed Limit: ");
        int speedLimit = scan.nextInt();
        System.out.println("Enter current speed: ");
        int currentSpeed = scan.nextInt();
        int overTheLimit = currentSpeed - speedLimit;
        System.out.println("You are driving " + overTheLimit + " mph over the limit. Slow down!");


 //       int speedLimit = 55;
  //      int currentSpeed = 75;
        //     int overTheLimit = currentSpeed - speedLimit;
 //       System.out.println("You are driving " + overTheLimit + " mph over the limit. Slow down!");
    }


}

//speedLimit 55, currentSpeed 75, overTheLimit currentSpeed-speedLimit. Print: u are driving 20mph over the limit.Slow down!
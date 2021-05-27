package Mine;

import java.sql.SQLOutput;

public class saim_03_14_21 {
    public static void main(String[] args) {
        //1
        int time = 5;  //Campus time: User enters a time
        if (time >= 8 && time <= 23) {
            System.out.println("Open ");
        } else if (time > 1 && time < 8 || time == 24) {
            System.out.println("Closed");
        } else {
            System.out.println("Invalid time");
        }
        //        if (time < 0 || time > 24) {
        //            System.out.println("Invalid time");
        //        } else if(time >= 8 && time <= 23) {
        //            System.out.println("Campus is open");
        //        } else {
        //            System.out.println("Campus is closed");
        //        }
//2
        System.out.println();
        System.out.println("Enter your mass and height: ");  //BMI:
        double mass = 140.0;
        double height = 1.60;
        double bmi = mass / (height * height);
        System.out.println("your mass: " + mass);
        System.out.println("your height: " + height);
        System.out.println("your BMI: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 || bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi >= 25 || bmi < 30) {
            System.out.println("Overweight");
        } else if (bmi >= 30) {
            System.out.println("Obese");
        }
//3
        int num1 = 7; //smallest number
        int num2 = 57;
        int num3 = 9;
        if (num1 > num2 && num2 > num3) {
            System.out.println("Smallest number is: " + num3);
        } else if (num1 > num2 && num3 > num2) {
            System.out.println("Smallest number is: " + num2);
        } else {
            System.out.println("Smallest number is: " + num1);
        }
        System.out.println();
//4
        int num4 = 53;  //Output: The biggest number from 3, 2 and 6 is: 6
        int num5 = 86;
        int num6 = 91;
        if(num4 == num5 && num5 == num6){
            System.out.println("All integers are the same");
        }else if(num4 > num5 && num5 > num6){
            System.out.println("Biggest number is: " + num4);
        }else if(num5 > num4 && num5 > num6){
            System.out.println("Biggest number is: " + num5);
        }else{
            System.out.println("Biggest number is: " + num6);
        }
//5
        System.out.println(); //Print out how many days are in that given month.
        System.out.println("Enter number of the month:");
        int month = 4;
        if(month == 1 || month == 3 || month == 5|| month ==7 || month ==8 || month ==10 || month == 12){
            System.out.println("31 days");
        }else if(month == 4 || month == 6 || month ==9 || month == 11){
            System.out.println("30 days");
        }else if(month == 2){
            System.out.println("28 days");
        }
    }
}

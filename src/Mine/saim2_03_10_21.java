package Mine;
import java.util.Scanner;
public class saim2_03_10_21 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scan.nextInt(); //TODO: WHY SOMETIMES THEY ARE TOGETHER DOESN'T RUN
        int d2 = num % 2; //Create a program that will accept a number and it will print if it is evenly divisible by 2, 3, and 5
        int d3 = num % 3;
        int d5 = num % 5;
        if(d2 == 0){
            boolean num1 = true;
            System.out.println(num + " is divisible by 2: " + num1);
        }else{
            boolean num1 = false;
            System.out.println(num + " is divisible by 2: " + num1);
        }
        if(d3 == 0){
            boolean num1 = true;
            System.out.println(num + " is divisible by 3: " + num1);
        }else{
            boolean num1 = false;
            System.out.println(num + " is divisible by 3: " + num1);
        }
        if(d5 == 0){
            boolean num1 = true;
            System.out.println(num + " is divisible by 5: " + num1);
        }else{
            boolean num1 = false;
            System.out.println(num + " is divisible by 5: " + num1);
            // int number = 65;
            //        boolean by2 = number % 2 == 0;
            //        boolean by3 = number % 3 == 0;
            //        boolean by5 = number % 5 == 0;
            //
            //        System.out.println(number + " is divisible by 2: " + by2);
            //        System.out.println(number + " is divisible by 3: " + by3);
            //        System.out.println(number + " is divisible by 5: " + by5);
            System.out.println();
            Scanner scan2 = new Scanner(System.in); //Write a java program that can identify if a person is eligible to vote for the president
            System.out.println("Enter the age: ");
            int age = scan2.nextInt();
            if(age >= 18){
                System.out.println("Eligible to vote");
            }else{
                System.out.println("Not eligible to vote");
            }
            System.out.println();//Write a program that will accept a boolean value. Print out the opposite of the given boolean
            Scanner scan3 = new Scanner(System.in);
            System.out.println("Enter boolean:");
            boolean v = scan3.nextBoolean();
            if(v == true){
                System.out.println("false");
            }else{
                System.out.println("true");
            }

        }

    }

}

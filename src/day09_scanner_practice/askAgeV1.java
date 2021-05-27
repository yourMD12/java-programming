package day09_scanner_practice;

import java.util.Scanner;

public class askAgeV1 {
    public static void main ( String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scan.nextInt();
        System.out.println(age + " - this is a great age!");
        System.out.println();
        System.out.println("What is the name of your best friend?");
        String name = scan.next();
        System.out.println(name +" How old is she?");
        int age1 = scan.nextInt();
        System.out.println("It's so cool!");
        //scan.close(); optionally close the scanner



    }

}

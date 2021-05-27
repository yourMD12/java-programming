package day13_conditional_statesmets;

import java.util.Scanner;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        //secretPincode ****, inputPincode ****, if condition checks if secretpin equals inputPin
        //true: welcome to your account. You can withdraw, check balance and deposit
        //false: incorrent pincode 1234! Please try again
        //in the end: Thank u for using TD bank ATM
        Scanner scan = new Scanner(System.in);

        System.out.println("***WELCOME TO TD BANK ATM***");
        int secretPincode = 1234;
        int inputPincode = scan.nextInt();
        if(secretPincode ==inputPincode){
            System.out.println("Welcome to your account! You can withdraw, check balance and deposit");
        }else{
            System.out.println("Incorrent pincode " + inputPincode + "! Please try again");
        }
        System.out.println("***THANK YOU FOR USING TD BANK ATM***");
    }
}

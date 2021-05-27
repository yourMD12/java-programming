package day24_loops;
import java.util.Scanner;
public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int code = 1234;
        int pinCode; //declare here so that visible for while condition
        do{
            System.out.println("enter your pin");
            pinCode = scan.nextInt();
        }while(pinCode !=code);
        System.out.println("welcome to your account");
    }
}

package day18_conditions_practice_string_intro;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("enter number:");
        int num = scan.nextInt();
        if(num%2 == 0){
            System.out.println(num + " is even");
        }else{
            System.out.println(num +  " is odd");
        }
    }
}

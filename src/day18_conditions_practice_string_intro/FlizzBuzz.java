package day18_conditions_practice_string_intro;
import java.util.Scanner;
public class FlizzBuzz {
    public static void main(String[] args) {
        //1 -100
        //fizzbuzz - num / by 3 and 5; fizz / 3, buzz / 5
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scan.nextInt();
        if(num % 5 == 0 && num % 3 == 0) {
            System.out.println("fizzBuzz");
        }else if(num % 3 == 0){
            System.out.println("fizz");
        }else if(num % 5 == 0){
            System.out.println("buzz");
        }
    }
}

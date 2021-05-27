package day24_loops;
import java.util.*;
public class GuessTheNumber {
    public static void main(String[] args) {
        Random randomNum = new Random();
        Scanner scan = new Scanner(System.in);
        //System.out.println(random.nextInt(101));
        int secretNum = randomNum.nextInt(101);
        int guessingNum = 0;
        do{
            System.out.println("guess the secret number");
            guessingNum = randomNum.nextInt(101);
            if(guessingNum > secretNum){
                System.out.println("too large");
            }else if(guessingNum < secretNum){
                System.out.println("too small");
            }
        }while(guessingNum != secretNum);
        System.out.println("congratulations, you won! secret number: " + secretNum);

    }
}

package day24_loops;
import java.util.Scanner;
public class GiveMe5$ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dollar = scan.nextInt();
        while(dollar !=5){
            System.out.println("give me 5$");
            dollar = scan.nextInt();
        }
        System.out.println("thank u for 5$");
    }
}

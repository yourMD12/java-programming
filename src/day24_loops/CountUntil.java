package day24_loops;
import java.util.Scanner;
public class CountUntil {
    public static void main(String [] args){
        System.out.println("enter a number");
        Scanner scan = new Scanner(System.in);
        int numToStop = scan.nextInt();
        int start = 1;
        while(start <= numToStop) {
            System.out.print(start + " ");
            start++;
        }
    }
}

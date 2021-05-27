package day09_scanner_practice;

import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter fahrenheit: ");
        int f = scan.nextInt();
        int c = (f - 32) * 5/9;
        System.out.println(c);
        System.out.println(f + " F is in C: " + c);

    }
}

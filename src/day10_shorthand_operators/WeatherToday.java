package day10_shorthand_operators;

import java.util.Scanner;

public class WeatherToday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
   //546     System.out.println("How is the weather today?");
   //     String weather= scan.next();
   //     System.out.println(weather + " - is a nice day today!");

        System.out.println("Enter values");
        double rent = scan.nextDouble();
        String month = scan.nextLine();
        System.out.println((rent));
        System.out.println(month); //glitch, if u tape after nextDouble/Int/Boolean etc, next line will ignore command

    }

}

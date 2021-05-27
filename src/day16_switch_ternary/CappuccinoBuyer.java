package day16_switch_ternary;
import java.util.Scanner;
public class CappuccinoBuyer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of Cappuccino:");
        String size = scan.next(); //"tall";//"grande", "venti"
        double price = 0.0;
        int calories = 0;
        //size == tall -> P=3.69 , C=90, "Cappuccino tall size please"
        // s= grande, p=3.99 c=120 "Cappuccino grande size please"
        // s= venti, p=4.29 c=150 "Cappuccino venti size please"
        //smthg else= We don't serve that size of Cappuccino
        //total p: + You will consume ..cal
        switch (size) {
            case "tall":
                System.out.println("Cappuccino tall size please");
                price = 3.69;
                calories = 90;
                break;
            case "grande":
                System.out.println("Cappuccino grande size please");
                price = 3.99;
                calories = 120;
                break;
            case "venti":
                System.out.println("Cappuccino venti size please");
                price = 4.29;
                calories = 150;
                break;
            default:
                System.out.println("We don't serve that size of Cappuccino");
                break;
        }
        System.out.println("Total price: " + price);
        System.out.println("You will consume " + calories + " calories");

    }
}

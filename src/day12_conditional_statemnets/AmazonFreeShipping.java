package day12_conditional_statemnets;

import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total price:");
        double totalPrice = scan.nextDouble();
        double rest = 25 - totalPrice;
        if(totalPrice >= 25){
            System.out.println("FREE SHIPPING ELIGIBLE. Your order total: $" + totalPrice);
        }else{
            System.out.println("NOT ELIGIBLE FOR FREE SHIPPING. Your order total is $" + rest + " less than minimum of $25");
        }
        System.out.println("THANKS FOR SHOPPING AMAZON!");
    }
}

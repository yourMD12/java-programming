package day09_scanner_practice;

import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price for milk: $");
        double milk = scan.nextDouble();
        System.out.println("Enter price for bread: $");
        double bread = scan.nextDouble();
        System.out.println("Enter price for cucumbers: $");
        double cucumbers = scan.nextDouble();
        double totalPrice = milk + bread + cucumbers;
        System.out.println("Total is: $ " + totalPrice);

        System.out.println();
        System.out.println();




        double price1 = 3.99;
        double price2 = 2.55;
        double price3 = 4.10;
        double total = price1 + price2 + price3;
        System.out.println("====SHOPPING IN TARGET====\nmilk " + price1 + "\nbread " + price2 + "\ncucumbers " + price3);
        System.out.println("Total is: $" + total);

    }
}
// target; milk,bread,cucumber. Enter price for milk 3.99, for bread 2.55, for cucumbers 4.10. Total is $
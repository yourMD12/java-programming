package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {
        // balance 345.50; price1 20.88; price2 89.99; price3 15; remainingBalance->calculate
        double balance = 345.50;
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15;
        double remainingBalance = balance - (price1 + price2 + price3); //WITH DECIMALS
        //int remainingBalance = (int)balance - ((int)price1 + (int)price2 + (int)price3); //WITHOUT DECIMALS
        int balanceWithNoCents = (int)remainingBalance;
       // System.out.println("Your remaining balance: $" + remainingBalance); FOR 1ST EX
        System.out.println("Your rest: " + balanceWithNoCents);



    }
}

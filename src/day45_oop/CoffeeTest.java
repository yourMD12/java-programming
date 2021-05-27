package day45_oop;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount: " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refill= " + myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("amount after drink 10: " + myCoffee.getAmount());
        myCoffee.setType("turkish coffee");
        System.out.println("my coffee: " + myCoffee.getType());
        //describe myCoffee -> show all variable values
        System.out.println(myCoffee.toString()); //Coffee{amount=90, type='turkish coffee'}

        //add another coffee object, set values, call methods

        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee1 type: " + coffee1.getType()); //coffee1 type: cappuccino
        //assign coffee1 object to coffee2
        //java point coffee2 to same object as coffee1
        Coffee coffee2 = coffee1;
        System.out.println("coffee2 type = " + coffee2.getType()); //coffee2 type = cappuccino
        coffee2.setType("espresso");

        Coffee coffee3 = new Coffee();
        coffee3.setType("frappe");
        //point the same object as coffee2
        coffee3 = coffee2;
        System.out.println("coffee3.getType() = " + coffee3.getType()); //coffee3.getType() = espresso

        Coffee coffee4 = null;//refernce variable doesnt refer/point to any object in HEAP
        coffee4.setType("latte"); //NullPointerException




    }


}

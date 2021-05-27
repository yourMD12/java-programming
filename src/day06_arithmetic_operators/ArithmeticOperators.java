package day06_arithmetic_operators;

public class ArithmeticOperators {
    public static void main (String [ ]args){
        //+ - * / %
        System.out.println(5 + 10);
        System.out.println(10 - 3);
        System.out.println(-3 * 8);
        System.out.println(8 / 2);
        System.out.println(7 % 3);
        System.out.println(12 % 5);
        System.out.println(-3 + 4);
        System.out.println(7 / 3);

        int chairs = 4 + 2;
        System.out.println(chairs);
        int plates =10 + 20 + 12 + 0;
        System.out.println("There are " + plates + " plates in the kitchen");
        System.out.println();
        System.out.println();
        System.out.println();
        int honda = 431;
        int tesla = 233;
        int mers = 2;
        int opel = 20;
        int henda = 1;
        int vws = 155;
        //int totalCarsInParking = 431 + 233 + 2 + 20 + 1 + 155; //OR
        int totalCarsInParking = honda + tesla + mers+ opel + henda + vws;
        System.out.println("There are " + totalCarsInParking + " cars in parking lot" );




    }
}

package day11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        //10 > 5 ? //true /yes
        // 5 > 50 ? //false/no
        //423==423 ? //true/yes
        //555==111 ? //false/no
        System.out.println(7 == 7);
        System.out.println(4 > 3);
        System.out.println(4 < 3);
        System.out.println(1452 <= 478569);
        System.out.println(4 >= 3);
        System.out.println(5 != 8);
        System.out.println();

        int a = 200;
        int b = 100;
        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a <= b );
        System.out.println(a >= b);
        System.out.println(a != b);

        boolean result;
        result = 5 == 5;
        System.out.println("result " + result);
        System.out.println();
        
        result = 33 > 44;
        System.out.println("result = " + result);
        System.out.println();
        result = 88 < 99;
        System.out.println("result = " + result);
        System.out.println();
        result = 10 >= 10;
        System.out.println("result = " + result);
        System.out.println();
        result = 123 <= 124;
        System.out.println("result = " + result);
        System.out.println();
        result = 2 != 2;
        System.out.println("result = " + result);
        System.out.println();
        String city = "Seattle";
        System.out.println(city == "Seattle");
        System.out.println(city == "Baku");
        System.out.println(city != "Baku");
        String name = "Nadir";
        boolean checkName = name == "Nadir";
        System.out.println("checkName = " + checkName); //true
        checkName = name != "Kuzzat";
        System.out.println("checkName = " + checkName);




    }
}

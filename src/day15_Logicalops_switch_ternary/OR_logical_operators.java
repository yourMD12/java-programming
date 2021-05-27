package day15_Logicalops_switch_ternary;

public class OR_logical_operators {
    public static void main(String[] args) {
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true ||false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));
        System.out.println();
        int apples = 5;
        int oranges = 7;
        System.out.println(apples > 3 || oranges > 4); //true
        if(apples > 3 || oranges >4){
            System.out.println("no more fruits");
        }else{
            System.out.println("go to the store");
        }
        System.out.println(apples > 2|| oranges > 10); // true
        System.out.println(apples > 2 && oranges > 10); // false
        System.out.println(apples == 0 || oranges == 0); //false

        if(apples == 0|| oranges == 0){
            System.out.println("we need to purchase some fruit");
        }else{
            System.out.println("we are good with fruits");
        }

    }
}

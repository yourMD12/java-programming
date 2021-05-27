package day10_shorthand_operators;

public class ChangeVariableValue {
    public static void main(String[] args) {
        int count = 3;
        System.out.println(count);
        count = count + 15;
        System.out.println(count);
        count = count -4;
        System.out.println(count);
        count = count * 4;
        System.out.println(count);
        count = count / 2;
        System.out.println(count);
        System.out.println();
        int cents = 244;
        System.out.println("cents= " + cents);
        //keep whole dollars portion and just assign remaining cents
        cents = cents % 100;
        System.out.println("cents= " + cents);
    }
}

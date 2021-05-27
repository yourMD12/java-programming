package day07_arithmetic_operators_casting;

public class OperatorPrecedence {
    public static void main ( String [] args ){
        System.out.println(10 + 5); //15
        System.out.println(10 + 5 -3); //12
        System.out.println(10 - 5 +3); //8
        System.out.println(10 - (5 + 3)); //2


        System.out.println(2 * 3); //6
        System.out.println(2 * 3 / 3); //2
        System.out.println(20 / (2 * 2 )); //5
      //  System.out.println(10 / 0); //ERROR
        System.out.println(2 + 5 * 3); //17
        System.out.println((2 + 5) * 3); //21
         System.out.println(10 / 3); //3 JAVA KEEPS THE CHANGE
        System.out.println(5 / 2); //2

    }
}

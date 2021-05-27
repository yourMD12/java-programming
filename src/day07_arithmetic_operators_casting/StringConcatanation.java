package day07_arithmetic_operators_casting;

public class StringConcatanation {
    public static void main ( String [] args){
        String p1 = "java";
        short p2 = 3;
        short p3 = 5;
        System.out.println(p1 + p2 + p3);//java35
        System.out.println(p1 + (p2 + p3) );//java8
        System.out.println( 5+3+ p1); //8java
        System.out.println(5 + (3 + p1));//53java

        System.out.println("hello" + 1+ 2 +3); //hello123
        System.out.println("hello" + (1 + 2 +3)); //hello6

        String str1 = "hello";
        String str2 = "friends";
        System.out.println( str1 + " " + str2 );

        int num1 =7;
        int num2 = 8;
        System.out.println(num1 + num2); //15
        System.out.println(num1 + " " + num2); //7 8
        System.out.println(num1 + "" + num2); //78




    }

}

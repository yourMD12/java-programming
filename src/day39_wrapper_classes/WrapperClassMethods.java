package day39_wrapper_classes;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class WrapperClassMethods {
    public static void main(String[] args) {

        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(50,35));
        System.out.println(Integer.min(10,4));
        System.out.println("min int: " + Integer.MIN_VALUE);
        System.out.println("max int: " + Integer.MAX_VALUE);

        System.out.println(Double.max(234.5, 23.9));
        System.out.println("min double: " + Double.MIN_VALUE);
        System.out.println("max double: " + Double.MAX_VALUE);

        System.out.println(Double.compare(5,1)); // 1: 1st larger than 2nd
        System.out.println(Double.compare(5,5)); // 0: both equal
        System.out.println(Double.compare(5,45)); // -1: 2nd larger that 1st

        System.out.println(Character.isDigit('8')); // true
        System.out.println(Character.isDigit('v')); // false
        System.out.println(Character.isAlphabetic('A')); // true
        System.out.println(Character.isLetter('r')); // true
        System.out.println(Character.isLetter('9')); // false
        char letter = 'A';
        if(Character.isUpperCase(letter)) { // true
            System.out.println("it is uppercase");
        }
        String word = "JaVa iS FuN";
        for(int i =0; i < word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                System.out.print(word.charAt(i)); // JVSFN
            }
        }
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);

        System.out.println(Boolean.TRUE);




    }
}

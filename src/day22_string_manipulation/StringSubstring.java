package day22_string_manipulation;

public class StringSubstring {
    public static void main(String[] args) {
        String word = "java is fun";
        /**
         * 1. word.substing(startIndex, endIndex)
         * 2. substring(startIndex)
         */
        System.out.println(word.substring(0, 4)); // java
        System.out.println(word.substring(0, 7)); // java is
        System.out.println(word.substring(5,7)); //is

        System.out.println(word.substring(8)); //or (8,11)
        System.out.println(word.substring(5));




    }
}

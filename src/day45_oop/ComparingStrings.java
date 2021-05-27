package day45_oop;

public class ComparingStrings {
    public static void main(String[] args) {

        String w1 = "java";// in string pool
        String w2 = "java"; // re-use from string pool
        String w3 = new String("java"); //create in HEAP, outside string pool
        System.out.println(w1==w2); //true
        System.out.println(w1==w3); //false
        System.out.println(w1.equals(w2)); //true
        System.out.println(w1.equals(w3)); //true



    }
}

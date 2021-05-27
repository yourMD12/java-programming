package day23_string_manipulation_while_loop;

public class ChainingStringMethods {
    public static void main(String[] args) {

        String word = "wooden spoon";
        System.out.println(word.toUpperCase().toLowerCase().length());
        String w = "woo den sp oon";
        //remove spaces 1st -> print upperCase
        System.out.println(w.replace(" ","").toUpperCase());

        String city = "chicago";
        System.out.println(city.substring(0,1).toUpperCase()); //C
        System.out.println(city.substring(0,1).toUpperCase()+ city.substring(1)); //Chicago
        String city1 = "ISTANBUL";
        System.out.println(city1.substring(0,1).toUpperCase() + city1.substring(1).toLowerCase());//Istanbul

        city.isEmpty();// we can not use .toUpperCase or whatever







    }
}

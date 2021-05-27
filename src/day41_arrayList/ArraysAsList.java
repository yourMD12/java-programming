package day41_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ArraysAsList {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(23,1,34,54,654);
        System.out.println("nums = " + nums);
        // nums.add(100); error
        // nums.remove(0); error
        List<Integer> numsList = new ArrayList<>(Arrays.asList(4,2,4,23,5344,100));
        numsList.add(57);
        numsList.add(33);
        System.out.println("numsList = " + numsList); // numsList = [4, 2, 4, 23, 5344, 100, 57, 33]
        numsList.remove(0);
        numsList.remove(new Integer(23));
        System.out.println("numsList = " + numsList); // numsList = [2, 4, 5344, 100, 57, 33]

        /**
         *  List String drinkWithCaffeine -> coffee tea monster redBull coke pepsi mdew kambucha celsius
         *  int caffeineAmount =0;
         *  monster, redBull, celsius
         *      caffeineAmount = 150;
         *  coffee, kambucha
         *      caffeineAmount = 112;
         *  tea, coke,pepsi, mdew
         *      caffeineAmount = 35;
         */
        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "redBull", "coke",
                "pepsi", "kambucha", "celsius"));
        System.out.println(drinksWithCaffeine);
        int caffeineAmount =0;
        for(String drink : drinksWithCaffeine){
            if(drink.equals("monster")||drink.equals("redBull")||drink.equals("celsius")){
                caffeineAmount = 150;
                System.out.println(drink + " -->" + caffeineAmount);
            }
            if(drink.equals("coffee")||drink.equals("kambucha")){
                caffeineAmount = 112;
                System.out.println(drink + " -->" + caffeineAmount);
            }
            if(drink.equals("tea")||drink.equals("coke")||drink.equals("pepsi")){
                caffeineAmount = 35;
                System.out.println(drink + " -->" + caffeineAmount);
            }
        }
        for(String drink : drinksWithCaffeine){
            switch(drink){
                case "monster": case "redBull": case "celsius":
                    caffeineAmount = 150;
                    System.out.println(drink + " -->" + caffeineAmount);
                    break;
                case "coffe": case "kambucha":
                    caffeineAmount = 112;
                    System.out.println(drink + " -->" + caffeineAmount);
                    break;
                case "tea": case "coke": case "pepsi":
                    caffeineAmount = 35;
                    System.out.println(drink + " -->" + caffeineAmount);
                    break;
            }
        }
        drinksWithCaffeine.forEach(drink -> System.out.println(drink)); // print all names of drinks
        drinksWithCaffeine.forEach(drink -> System.out.println(drink.toUpperCase()));
        drinksWithCaffeine.forEach(drink -> {
            System.out.println("this is forEach block");
            System.out.println("drink = " + drink);
        });



    }
}

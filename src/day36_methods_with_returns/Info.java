package day36_methods_with_returns;
import java.util.*;

public class Info {
    public static void main(String[] args) {

        fullName();
        System.out.println("name = " + fullName());
        isMarried();
        System.out.println(isMarried());
        getAge();
        System.out.println(getAge());
        getRandomYear();
        System.out.println(getRandomYear()); // dynamic, different year each time

        String name = fullName();
        boolean isMar = isMarried();
        int age = getAge();
        int year = getRandomYear();
        System.out.println(name);
        System.out.println(isMar);
        System.out.println(age);
        System.out.println(year);

        if(isMarried()){
            System.out.println("married");
        }else{
            System.out.println("single");
        }





    }
    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }
    public static String fullName(){
        //System.out.println("Mike Smith");
        return "Mike Smith";
    }
    public static boolean isMarried(){
        return false;
    }
    public static int getAge(){
        // int age = 35;
        return 35;
        // return age;
    }

}

package day14_multi_branch_if_statements;
import java.util.Scanner;
public class DayActivity {
    public static void main(String[] args) {
        //sunny, rainy, snowy, windy
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose the weather:sunny");
        String weather = scan.next();
        if(weather.equals("sunny")){
            System.out.println("Go to park, hiking and code Java");
        }else if(weather.equals("rainy")){
            System.out.println("Stay home, drink tea and code Java");
        }else if(weather.equals("snowy")){
            System.out.println("Clean the car, build snowman, drink hot chocolate and code Java");
        }else if(weather.equals("windy")){
            System.out.println("Get ready for power lose, fly a kite and code Java");
        }else{
            System.out.println("Just keep coding Java");
        }



    }
}

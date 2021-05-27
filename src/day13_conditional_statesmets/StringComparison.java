package day13_conditional_statesmets;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringComparison {
    public static void main(String[] args) {
        String city = "NY";
        if(city.equals("NY")){ // (city == "NY") EVEN SPACE CAN CHANGE CONDITION FROM TRUE TO FALSE
            System.out.println("Its NY");
        }else{
            System.out.println("Its not NY");
        }
        System.out.println();
        String weather = "sunny";
        if(weather.equals("sunny")){
            System.out.println("lets go outside and print java");
        }else{
            System.out.println("lets stay indoor and code java");
        }
    }
}

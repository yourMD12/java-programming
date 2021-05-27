package day41_arrayList;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {

        // cars list
        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add("tesla");
        myCars.add(0,"jeep");
        myCars.add(1,"lada");
        myCars.add(2,"yugo");
        // jeep, lada, yugo, toyota, mazda, ford, moskvich...
        System.out.println(myCars); // [jeep, lada, yugo, toyota, mazda, ford, moskvich, tesla]
        System.out.println(myCars.toString()); // same
        String allCarsIn1string = myCars.toString(); //saves all cars in one string variable

        System.out.println("allCarsIn1string = " + allCarsIn1string); // allCarsIn1string = [jeep, lada, yugo, toyota, mazda, ford, moskvich, tesla]
        // change idx 0 to lamborghini, replace = set
        myCars.set(0,"lamborghini");
        System.out.println("after set: " + myCars); // after set: [lamborghini, lada, yugo, toyota, mazda, ford, moskvich, tesla]

        // change 4 to honda
        myCars.set(4,"Honda");
        System.out.println("after set honda: " + myCars); // after set honda: [lamborghini, lada, yugo, toyota, Honda, ford, moskvich, tesla]

        /**
         * how would u do that if myCars was array?
         * myCars[4] = "honda";
         */
        // find the idx number of ford
        System.out.println(myCars.indexOf("ford")); // 5
        int mosk = myCars.indexOf("moskvich");
        System.out.println("mosk = " + mosk);
        // change moskvich to jiguli
        myCars.set(mosk, "jiguli");
        System.out.println("after set up: " + myCars);

        // replace ford with trabant using single statement: indexOf("ford") -> trabant
        myCars.set(myCars.indexOf("ford"), "trabant");
        System.out.println(myCars);

        // lada -> bugatti
        /*
        if myCars contains "lada" -> find idx of it set value to bugatti, else print "lada is not found"
         */
        if(myCars.contains("Lada")){
            myCars.set(myCars.indexOf("lada"),"bugatti");
        }else{
            System.out.println("lada is not found");
        }
        System.out.println(myCars);
        // lamborghini -> prius
        // lada -> lexus
        // trabant -> audi
        for(int i = 0; i < myCars.size(); i++){
            if(myCars.get(i).equals("lamborghini")){
                myCars.set(i,"prius");
            }
            if(myCars.get(i).equals("lada")){
                myCars.set(i,"lexus");
            }
            if(myCars.get(i).equals("trabant")){
                myCars.set(i,"audi");
            }
        }
        System.out.println(myCars);







    }
}

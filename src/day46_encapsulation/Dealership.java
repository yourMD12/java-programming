package day46_encapsulation;

import java.util.Arrays;

public class Dealership {
    public static void main(String[] args) {
        Car car1 = new Car();
        //ERROR below: model and year are PRIVATE  & can't be accessed from a different class
        //car1.model = "Nissan Altima";
        //car1.year = 2020;

        car1.setModel("Nissan Altima");
        System.out.println(car1.getModel()); //Nissan Altima

        car1.setYear(2020);
        System.out.println(car1.getYear()); // 0(without this.year), with (this.) -> 2020

        car1.setMileage(13967);
        System.out.println(car1.getMileage());

        System.out.println(car1.toString()); //Car + model = Nissan Altima

        Car alfaRomeo = new Car();
        alfaRomeo.setModel("Giulia Ti AWD");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMileage(16604);
        System.out.println("model = " + alfaRomeo);
        System.out.println("year: " + alfaRomeo.getYear()); //year: 2017
        System.out.println("mileage: " + alfaRomeo.getMileage()); //mileage: 16604
        System.out.println(alfaRomeo); //Car + model = Giulia Ti AWD

    }
}

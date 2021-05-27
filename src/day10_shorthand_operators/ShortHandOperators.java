package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in parking lot= " + cars);
        cars = cars + 2;
        System.out.println("cars in parking lot= " + cars);
        cars += 5;
        System.out.println("cars in parking lot= " + cars);
        cars -=7;
        System.out.println("cars in parking lot= " + cars);
       // cars = cars - 1;
        cars -=1;
        System.out.println("cars in parking lot= " + cars);

        int electricCars = 13;
        //cars = cars + electricCars;
        cars += electricCars;
        System.out.println("cars in parking lot= " + cars);
        
        String word = "Java";
        System.out.println("word = " + word);
        word = word + " programming";
        System.out.println("word = " + word);
        word += " is cool";
        System.out.println("word = " + word);

        String selenium = " but \"selenium\" is more fun ";
        word += selenium;
        System.out.println("word = " + word);
        //add numbers
        word += 12345;
        System.out.println("word = " + word);

        char letter = 'A';
        System.out.println("letter =" + letter);
        letter += 3;
        System.out.println("letter = " + letter); //it will shows D (hello unicode)
        letter += 6; //if type J nothing will happen
        System.out.println("letter = " + letter); // will be J
        letter += 'F';
        System.out.println("letter = " + letter); // it will add number of J with adding number F


        double parkingFee = 7.50;
        System.out.println("parking fee = " + parkingFee);
        // before 10am 50% off
        parkingFee /= 2;
        System.out.println("parking fee before 10am = " + parkingFee);
        //weekend is free
        parkingFee -= parkingFee;
        System.out.println("parkingFee = " + parkingFee);



        


    }
}

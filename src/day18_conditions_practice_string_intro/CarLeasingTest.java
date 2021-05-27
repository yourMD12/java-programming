package day18_conditions_practice_string_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        //mercedes model E leasePrice 500, model A price 400
        //audi model SQ5 leasePrice 552 A3 412
        String car = "audi";//mers
        String model = "SQ5";
        double price = 0;
        if(car.equals("mercedes")){
            if(model.equals("E")){
                price = 500;
                System.out.println("You choose mersedes " + model + " model for $" + price);
            }else if(model.equals("A")){
                price = 400;
                System.out.println("You choose mersedes " + model + " model for $" + price);
            }
        }else if(car.equals("audi")){
            if(model.equals("SQ5")){
                price = 552;
                System.out.println("You choose audi " + model + " model for $" + price);
            }else if(model.equals("A3")){
                price = 412;
                System.out.println("You choose audi " + model + " model for $" + price);
            }
        }else{
            System.out.println("invalid data");
        }


    }
}

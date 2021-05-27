package day15_Logicalops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
        double budget = 5_000;
        double carPrice = 4_500;
        String model = "Toyota"; //OR "Honda","Tesla";
        if(carPrice <=budget && model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla")){
            System.out.println("I'll take this " + model + " for " + carPrice + " dollars");
        }else{
            System.out.println("I don't want this car");
        }



        // budget=5000, carPrice=4500, model->toyota,honda,tesla
        //using if cond.with logical operators.decide if u would like to purchase the car
        //1.=needs to be within budget AND 2.needs to be toyota OR tesla OR honda
    }
}

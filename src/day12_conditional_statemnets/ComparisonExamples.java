package day12_conditional_statemnets;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed = 45;
        int speedLimit = 55;
        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding ?" + isSpeeding); //OR
        //System.out.println(currentSpeed > speedLimit); //false
        //System.out.println(speedLimit < currentSpeed); //false
        System.out.println("currentSpeed = " + currentSpeed + " mph");
        System.out.println("speedLimit = " + speedLimit + " mph");

        currentSpeed += 20;
        isSpeeding = currentSpeed > speedLimit;
        System.out.println("isSpeeding = " + isSpeeding);
        System.out.println("speedLimit = " + speedLimit);
        System.out.println("currentSpeed = " + currentSpeed);
        System.out.println();
        double accBalance = 250.25;
        double itemPrice = 200.99;
        System.out.println("can I afford? - " + (itemPrice <= accBalance)); //true
        boolean canAfford = itemPrice <= accBalance;
        System.out.println("can afford " + canAfford);
        System.out.println();
        //decrease balance by itemPrice,using shorthand operator
        accBalance -= itemPrice;
        System.out.println(accBalance);
        boolean isBroke = accBalance <= 0;
        System.out.println("am I broke? = " + isBroke);




    }
}

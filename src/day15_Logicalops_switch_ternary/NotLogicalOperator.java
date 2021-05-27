package day15_Logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));// false
        System.out.println("!false = " + (!false)); // true
        int age = 2;
        //check if age IS NOT more than 7
        //"need to sit in the car seat"
        if (!(age > 7)) {
            System.out.println("Need to sit in the car seat");
        }
        System.out.println();
        boolean isSmokingAllowed = false;
        if (!(isSmokingAllowed == true)) {
            System.out.println("Smoking is not allowed here.Exit");
        }
        System.out.println();

        boolean isAffordable = false;
        if (!isAffordable) {
            System.out.println("item not affordable");
        } else {
            System.out.println("item is affordable");
        }
        System.out.println();
        String env = "qa";
        if(!env.equals("qa")){
            System.out.println("In wrong environment for QA testing");
        }
        System.out.println();
        String carModel = "Tesla";
        if(!carModel.equals("Tesla")){
            System.out.println("I dont want this car");
        }
        System.out.println();
        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if(!inputPassword.equals(secretPassword)){   //if(!(secretPassword == inputPassword)){
            System.out.println("Incorrect Password");
        }

    }
}

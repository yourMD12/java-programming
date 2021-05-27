package day17_ternary_nested_conditions;

import java.sql.SQLOutput;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        int itemPrice = 30;
        boolean isPrimeMember = false;
        //true "Eligible for free 2 day shipping"
        //otherwise : iP>25 "Eligible for free regular shipping"
        //otherwise  "Not eligible for free shipping,fee is $10"
        if(isPrimeMember == true) {
            System.out.println("Eligible for free 2 day shipping");
        }else{
            if(itemPrice > 25){
                System.out.println("Eligible for free regular shipping");
            }else{
                System.out.println("Not eligible for free shipping,fee is $10");
            }

        }
    }
}

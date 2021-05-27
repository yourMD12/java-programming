package day15_Logicalops_switch_ternary;

public class AndOperatorsPractice {
    public static void main(String[] args) {
        // oneSale, freeShipping,itemName
        //&& to check if u would add item in cart
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "spoon";
        if(onSale && freeShipping){
            System.out.println("I can add " + itemName + " to my cart ");
        }else{
            System.out.println("I can not add " + itemName + " to my cart");
        }
        //add to cart only if all 3 is especial (freeShip,onSale,itemName=spoon)
        if(onSale && freeShipping && itemName.equals("spoon")){
            System.out.println("I can add " + itemName + " to my cart ");
        }else{
            System.out.println("I can not add " + itemName + " to my cart");
        }
//location,salary,isRemote,isBenefits
        String location = "NY";
        double salary = 80_000;
        boolean isRemote = true;
        boolean isBenefits = true;
        if(location.equals("NY") && salary >= 80_000 && isRemote && isBenefits){
            System.out.println("I'll take this job!");
        }else{
            System.out.println("Nah, this job not for me");
        }

    }

}

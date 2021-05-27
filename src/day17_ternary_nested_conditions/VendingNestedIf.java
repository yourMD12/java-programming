package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
        //drink or snack
        //string drink = tea /coke
        //string snack = chips /candy
        //Drink option is selected: when drink: tea - tea is selected, coke - coke is selected
        //Snack option is selected: when snack: chips - chips is selected, candy is selected
        String selection = "drink";//snack
        String drink = "coke";
        String snack = "chips";
        if(selection.equals("drink")) {
            System.out.println("Drink option is selected:");
            if (drink.equals("tea")) {
                System.out.println("tea is selected");
            } else {
                System.out.println("coke is selected");
            }
        }else if(selection.equals("snack")){
                System.out.println("Snack option is selected:");
                if(snack.equals("chips")){
                    System.out.println("chips is selected");
                }else{
                    System.out.println("candy is selected");
                }
            }




    }
}

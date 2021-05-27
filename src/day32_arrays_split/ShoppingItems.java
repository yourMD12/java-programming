package day32_arrays_split;

public class ShoppingItems {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99,   150.0,    9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,  12346,    12347,    12348,     12349,   12350};

        System.out.println("=== index of GLOVES in item array ===");
        //use for loop
        for(int i =0; i < items.length;i++){
            if(items[i].equalsIgnoreCase("gloves")){
                System.out.println("gloves index - " +i);
               // System.out.println(i + " - " + items[i]);
                break;
            }
        }
        System.out.println("=== set boolean to true if item is found ===");
        boolean ipadExists = false;
        for(String item : items){
            if(item.equals("iPad")){
                ipadExists = true;
                break;
            }
        }
        System.out.println("ipadExists = " + ipadExists);
        System.out.println("=== report of each shopping item ===");
        // shoes - $99.99 - #12345 etc
        for(int i = 0; i < items.length; i++){
            System.out.println(items[i] + " - " + prices[i] + "$ - #" + itemIDs[i]);
        }
        System.out.println("== look for item ===");
        for(int i =0; i < items.length; i++){
            if(items[i].equalsIgnoreCase("jacket")){
                System.out.println(items[i] + " - " + prices[i] + "$ - #" + itemIDs[i]);
                break;
            }
        }



    }
}

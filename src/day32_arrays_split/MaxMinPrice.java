package day32_arrays_split;

public class MaxMinPrice {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99,   150.0,    9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,  12346,    12347,    12348,     12349,   12350};
        // find details of most expensive item, and cheapest

        double max =0;
        double min =0;
        int indexMax = 0;
        int indexMin = 0;
        for(int i =0; i < prices.length; i++){
            if(max < prices[i]){
                max =prices[i];
                indexMax =i;
            }
            if(prices[i] <= min){
                min = prices[i];
                indexMin =i;
            }
        }
        System.out.println(items[indexMax] + " - $" + prices[indexMax] + " - Item ID: " + itemIDs[indexMax]);
        System.out.println(items[indexMin] + " - $" + prices[indexMin] + " - Item ID: " + itemIDs[indexMin]);




    }
}

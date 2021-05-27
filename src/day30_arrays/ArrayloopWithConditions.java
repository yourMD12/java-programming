package day30_arrays;

public class ArrayloopWithConditions {
    public static void main(String[] args) {

        double[] prices = { 22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.4, 34.23, 124.9, 234.23 };
        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Brazil",
                "Portugal", "China", "Philippines", "Philippines", "China", "Philippines", "China", "Armenia", "Philippines",
                "China", "Colombia", "Philippines", "Honduras", "Indonesia", "Brazil", "China", "United States", "Russia"};
        //print all num from prices array that are more 100
        System.out.println(" prices less than 100: " );
        for(double eachPrice : prices) {
            if (eachPrice > 100.0) {
                System.out.println(eachPrice + " ");
            }
        }
        System.out.println("\nprices between 10 and 70:");
        for(double eachPrice : prices) {
            if (eachPrice > 10.0 && eachPrice <= 70) {
                System.out.println(eachPrice + " ");
            }
        }
        System.out.println("\ncount of the prices more than 50:");
        //count = 7
        int count =0;
        for(double each : prices){
            if(each > 50){
                count++;
            }
        }
        System.out.println(count);
        System.out.println();
        System.out.println("\ncountry with name length more than 7 chars:");
        for (String country : countries) {
            if (country.length() >= 7) {
                System.out.print(country + "-" + country.length() + " ");
            }
        }


    }
}

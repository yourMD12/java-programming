package day04_variables_intro;

public class AmazonItem {
    public static void main(String[]args){
       String description = "HIC wooden spoon";
       int ratingsCount = 181;
       double price = 5.99; //OR int price = 5;
        String seller = "amazon.com";
        boolean prime = true;
       // String prime = "yes";//INSTEAD OF BOOLEAN

        System.out.println("---PRODUCT INFORMATION---");
        System.out.println(description);
        System.out.print("* * * * * * * * * ");
        System.out.println(ratingsCount);
        System.out.println(price);
        System.out.println(seller);
        System.out.println(prime);



    }
}

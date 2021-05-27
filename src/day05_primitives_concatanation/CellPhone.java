package day05_primitives_concatanation;

public class CellPhone {
    public static void main(String[]args){
       String brand = "Samsung";
       String model = "S10";
       String color = "white";
       double price = 1599.0;
       int storage = 512;
       boolean hasCamera = true;

       System.out.println(brand);
       System.out.println(model);
       System.out.println(color);
       System.out.println(price);
       System.out.println(storage);
       System.out.println(hasCamera);

       System.out.println("brand is "+brand);
       System.out.println("model is "+model);
       System.out.println("color is "+color);
       System.out.println("our price is $"+price);
       System.out.println("also our storage is "+storage +" GB");
       System.out.println("and amazing camera is also "+hasCamera);

    }
}

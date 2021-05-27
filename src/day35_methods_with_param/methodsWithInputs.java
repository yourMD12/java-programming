package day35_methods_with_param;

public class methodsWithInputs {
    public static void main(String[] args) {
        displayValue(10);
        displayValue(7);
        int count = 55;
        displayValue(count);
        greetByName("Jack");
        String n1 = "Vasya";
        greetByName(n1);


    }

    public static void displayValue(int num){
        System.out.println("value is " + num);
    }
    public static void greetByName(String name){
        System.out.println("hello " + name + " how are u today?");
    }
}

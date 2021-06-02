package day49_static;

public class StaticMethods {

    int num = 10;
    static  int count =5;

    public static void displayMessage(String message){
        System.out.println("message = " + message);
        System.out.println("count = " + count); //count is static variable
        //System.out.println(num); ERROR: num is instance variable; static can't access
    }

    public static void anotherStaticMethod(){
        System.out.println("another static method");
        displayMessage("wooden spoon");
    }

    //StaticMethods.instanceMethod(); -> no
    //StaticMethods stm = new StaticMethods();
    //stm.instanceMethod();
    public void instanceMethod(){
        System.out.println("instance method");
    }

}

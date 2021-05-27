package day34_void_methods;

public class StartCar {
    public static void main(String[] args) {
        sitInCar();
        startTheCar();
        shiftToDrive();
    }

    public static void sitInCar(){
        System.out.println("1.open the door and sit in driver seat");
    }
    public static void startTheCar(){
        System.out.println("2.insert key to ignition and turn clockwise");
    }
    public static void shiftToDrive(){
        System.out.println("3.press brake pedal and shift");
    }

}

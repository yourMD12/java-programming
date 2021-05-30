package day48_constructor_practice;

public class Bus {
     Driver driver;
     Engine engine;

    public String toString(){
        return driver.getName() + " | " + engine.getCylinders();
    }
}

package day44_custom_classes;

public class App {
// app class is used as a template for app objects
    //we are describing app properties & behaviour here
    //objects will be able to use them

    String name; // null by default
    double version; // 0.0 by default

    public void open(){
        // use name & version variables in this method
        System.out.println("opening " + name + " app - version = " + version);
    }
}
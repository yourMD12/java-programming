package day44_custom_classes;

public class myApps {
    public static void main(String[] args) {
      // this class is used to create objects of app class
      // String app = "uber"; this is string object, just characters
//      App app2;
//        System.out.println("app = " + app);
        App uberApp = new App(); // creating new object
        //opening uber app - version = ...
        uberApp.name = "uber";
        uberApp.version = 3.4;
        uberApp.open(); // call open method using object variable
        uberApp.version = 4.0;
        uberApp.open();
        /**
         * create more objects and practice
         *
         */

    }
}

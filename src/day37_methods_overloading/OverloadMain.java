package day37_methods_overloading;
import java.util.Arrays;
public class OverloadMain {
    public static void main(String[] args) {

        System.out.println("hello from real main method");
        main(10);
        System.out.println(Arrays.toString(args));
    }

    /**
     overloading main method:
     same name + different param
     JDK doesn't look for this one to run
     */
    public static void main(int num){
        System.out.println("num: " + num);
    }
    public static void main(boolean b){
        System.out.println("b: " + b);
    }

}

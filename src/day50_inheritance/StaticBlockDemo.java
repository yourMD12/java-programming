package day50_inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticBlockDemo {
    static int num;
    static List<String> carModels;

    static {
        System.out.println("static initializer block");
        num = 10;
        carModels = new ArrayList<>();
        carModels.addAll(Arrays.asList("Alfa","audi","bentley","bmw","chevrolet"));
    }

    public StaticBlockDemo(){
        System.out.println("constructor method");
        num += 5;
    }
    //other methods that use the carModels arrayList

}

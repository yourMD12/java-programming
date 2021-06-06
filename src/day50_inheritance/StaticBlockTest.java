package day50_inheritance;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlockDemo st1 = new StaticBlockDemo(); //"static initializer block" will runs only once; static -> constructor
        StaticBlockDemo st2 = new StaticBlockDemo(); //"constructor method constructor method"   after we add constructor it will shows nums how many times we created new method
        StaticBlockDemo st3 = new StaticBlockDemo(); //"constructor method" 3 times <- constructor
        System.out.println(StaticBlockDemo.num); //25 1(10)+2(10)+3(5)=25
    }
}

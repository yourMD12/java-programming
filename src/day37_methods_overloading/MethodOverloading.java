package day37_methods_overloading;

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading.sum(10,5); //15
        sum(1,4,6); //11
        sum(10.4, 5.2); //15.6
        sum((int) 4,3); //7
        sum("hello", "world"); //helloworld

    }
    public static void sum(int n1, int n2){
        System.out.println("sum(int , int )");
        System.out.println("result: " + (n1 +n2));
    }
    public static void sum(double n1, double n2){
        System.out.println("sum(double, double)");
        System.out.println("result: " + (n1 +n2));
    }
    public static void sum(int n1, int n2, int n3){
        System.out.println("sum(int , int , int )");
        System.out.println("result: " + (n1 +n2 +n3));
    }
    public static void sum(String str1, String str2){
        System.out.println("sum(string , sting )");
        System.out.println("result: " + (str1 +str2));
    }

}

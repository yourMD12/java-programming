package day38_methods;

public class RecursiveMethod {
    public static void main(String[] args) {
//        int num =1;
//        System.out.println(num +" ");
//        num++;
//        main(null); INFINITE 1
        printNum(1); // for case1: 9330 and after error
        printNum(1); // for case2:  1-100


    }
//    public static void printNum(int num){
//        System.out.println(num + " ");
//        num++;
//        printNum(num);
//    }
    public static void printNum(int num){
        System.out.println(num + " ");
        num++;
        if(num <= 100) {
            printNum(num);
        }
    }


}

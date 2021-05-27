package day12_conditional_statemnets;

public class IfElseStatements {
    public static void main(String[] args) {
        if(10 > 5){
            System.out.println("condition is true");//WILL SHOW THAT LINE IF TRUE
        }else{
            System.out.println("condition is false");//WILL SHOW THIS LINE IF FALSE
        }
        System.out.println();
        int count = 25;
        if(count > 30){
            System.out.println("count is more than 30");
        }else{
            System.out.println("count is less than 30");
        }
        System.out.println();
        byte age = 14;
        if(age>= 18){
            System.out.println("eligible to vote");
            System.out.println("age is greater or equal to 18");
        }else{
            System.out.println("not eligible to vote");
            System.out.println("age is less to 18");
        }
        System.out.println();



    }
}

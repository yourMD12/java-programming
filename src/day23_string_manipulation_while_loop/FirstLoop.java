package day23_string_manipulation_while_loop;

public class FirstLoop {
    public static void main(String[] args) {
        int i = 1;
        if(i <= 5){
            System.out.println(i);
            //i++//2 BUT it will just finish the program
        }
        while(i <= 5){
            System.out.println(i);
             i++; //it will if condition 1 more time,and more time(2+1=3),again one more time(3+1=4),then 5,6--will stop code
        }
        
        int apples = 0;
        if(apples <= 10){
            System.out.println("apple- " +apples);
        }
        while(apples <= 3){
            System.out.println("apples = " + apples);
            apples++;
        }
        //infinite loop
        while(true){
            System.out.println("hello world");
        }





    }
}

package day25_loops;

public class FizzBuzz {
    public static void main(String[] args) {
        //1-100, if /3 && 5 -fizzBuzz; if / 3-fizz; if /5 -buzz; false-print num
        for(int i = 1; i <101; i++){
            if(i % 3 ==0 && i % 5 ==0){
                System.out.println("fizzBuzz " +i);
            }else if(i % 3 ==0){
                System.out.println("fizz " +i);
            }else if(i % 5 == 0){
                System.out.println("buzz " +i);
            }else{
                System.out.println(i);
            }
        }



    }
}

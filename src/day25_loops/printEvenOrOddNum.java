package day25_loops;

public class printEvenOrOddNum {
    public static void main(String[] args) {
        //print all even num 1-100
        //all odd num 1-100
        for(int i=1; i<101;i++){
            if(i % 2 ==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for(int o=1; o<101;o++){
            if(o % 2 !=0){
                System.out.print(o + " ");
            }
        }

    }
}

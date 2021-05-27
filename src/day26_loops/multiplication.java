package day26_loops;

public class multiplication {
    public static void main(String[] args) {
        int num = 1;
        if(num <1 || num > 10){
            System.out.println("error, invalid input");
            return; //exit main method, stop the program
        }else {
            for (int i = 1; i <= 10; i++) {
                int sum = i * num;
                System.out.println(num + " x " + i + " = " + sum);
            }
        }





    }
}

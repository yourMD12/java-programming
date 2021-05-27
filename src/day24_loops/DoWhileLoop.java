package day24_loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int count = 1;
        do{
            System.out.println("counter = " + count);
            count++;
        }while(count <= 10);
        int counter = 0;
        do{
            System.out.println("counter " + counter);
            counter+=5; //+=100 -will print each 100th num;
        }while(counter <= 1000);// will print each 5th

    }
}

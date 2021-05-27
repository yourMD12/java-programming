package day29_nestedLoops_arrays;

public class startsNestedLoop {
    public static void main(String[] args) {
        // outer 1-5, inner 1-10
        for(int i =1; i<= 5; i++){
            for(int j =1; j<= 10;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //outer 1-10; inner 1 to outer
        for(int outer =1; outer <= 10; outer++){
            for(int inner=1; inner <= outer; inner++){
                System.out.print("* ");
            }
            System.out.println();// go to new/next line
        }
    }
}

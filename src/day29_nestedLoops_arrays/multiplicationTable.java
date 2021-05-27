package day29_nestedLoops_arrays;

public class multiplicationTable {
    public static void main(String[] args) {

        //outer 1-10; inner 1-10;print: outer * inner + " ";
        for(int i=1; i <= 10; i++){
            for(int j =1; j<=10; j++){
                System.out.print(i + " * " + j + " = " + i * j + "\t "); //MORE GRACEFUL
                //sout ( i* j + " ");
            }
            System.out.println();
        }

    }
}

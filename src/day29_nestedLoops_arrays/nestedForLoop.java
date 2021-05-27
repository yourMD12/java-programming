package day29_nestedLoops_arrays;

public class nestedForLoop {
    public static void main(String[] args) {

 /**       for(int min = 1; min <= 5;min++){
            System.out.println("\nminutes = " + min + " ");
            for(int sec = 1; sec <= 60; sec++){
                System.out.print(sec + " ");
            }
        }
*/
        /** 0:1...0:2...0:3....0:59...1:0....1:1...
         */
        for(int min = 0; min <= 4;min++){
            for(int sec = 0; sec <= 59; sec++){
                System.out.println(min + ":" + sec);
            }
        }

    }
}

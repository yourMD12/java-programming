package day29_nestedLoops_arrays;

public class StringNestedLoop {
    public static void main( String[] args){

        String word = "java";
        // 1)find duplicates & count
        // 2)find unique character(appearing only once)
        // 3)print character and number of occurrences
        for(int i =0; i< word.length(); i++){
            for(int j =0; j<= i; j++){
                System.out.print(word.charAt(j));
            }
            System.out.println(); // add new line after inner loop
        }
        System.out.println();
        /**
         * java
         * ava
         * va
         * a
         */
        for(int i =0; i< word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
        System.out.println();



    }
}

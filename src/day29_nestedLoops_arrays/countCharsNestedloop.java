package day29_nestedLoops_arrays;

public class countCharsNestedloop {
    public static void main(String[] args) {

        System.out.println();
        /** outer 0- length
         * char letter = w.charAt(outer);
         * int count = 0;
         * inner 0- to length
         * char innerChar = word.charAt(inner);
         * if(outerChar == innerChar) --> count++
         * }
         * sout outerChar + ":" + count
         * }
         * //j=1 a=2 v=1 a=2
         */
        String word= "java";
        for(int outer = 0; outer < word.length();outer++ ) {
            System.out.println("outer: " + word.charAt(outer));
            int count = 0;
            for (int inner = 0; inner < word.length(); inner++) {
               // System.out.println(word.charAt(inner));
                if(word.charAt(outer) == word.charAt(inner)){
                    count++;
                }
            }
            System.out.println(word.charAt(outer) + "=" + count);
        }
        
    }
}

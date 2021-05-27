package day26_loops;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class PrintChars {
    public static void main(String[] args) {

        String word = "java";
        System.out.println(word.length());
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        // System.out.println(word.charAt(4)); NO VALUE
        System.out.println();
        String w = "today is java class and we are coding for loops";
  /**      for(int i =0; i< w.length();i++){
            System.out.print(w.charAt(i));
        }
        System.out.println();
   */
        for(int i =w.length() -1; i>=0;i--){
            System.out.println(w.charAt(i)); //REVERSE
        }

    }
}

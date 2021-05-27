package day32_arrays_split;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;
public class SplitMethod {
    public static void main(String[] args) {

        String words = "java,python,selenium,html";
        String [] wordsArray = words.split(",");
            System.out.println(Arrays.toString(wordsArray));
        System.out.println(wordsArray.length + " length");
        for(String each : wordsArray){
            System.out.println(each);
        }

        String sentence = "today i am coding java arrays";
        String [] s1 = sentence.split(" ");
        System.out.println(Arrays.toString(s1));
      //  System.out.println(sentence.split[0]); IT WILL GIVE US JUST 1ST WORD
        System.out.println("length " + s1.length);
        for(String ch : s1){
            System.out.println(ch);
        }









    }
}

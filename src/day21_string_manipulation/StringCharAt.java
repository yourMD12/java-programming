package day21_string_manipulation;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class StringCharAt {
    public static void main(String[] args) {
        //java       0123
        String w1 = "java";
        System.out.println(w1.charAt(0));
        System.out.println(w1.charAt(1));
        System.out.println(w1.charAt(2));
        System.out.println(w1.charAt(3));

        System.out.println(w1.length());

        String company = "cybertek";
        System.out.println("first letter " + company.charAt(0));
        char fir = company.charAt(0);
        System.out.println(fir);
        //c y b e r t e k
        char s =company.charAt(1);
        char t =company.charAt(2);
        char f =company.charAt(3);
        char fi =company.charAt(4);
        char si =company.charAt(5);
        char se =company.charAt(6);
        char e =company.charAt(7);
        System.out.println(fir + " " + s + " " + t + " " + f + " " + fi + " " + si + " " + se + " " + e);
        
        String withSpaces = fir + " " + s + " " + t + " " + f + " " + fi + " " + si + " " + se + " " + e;
        System.out.println("withSpaces = " + withSpaces);

        String word = "mom";
        char first = word.charAt(0);
        char last = word.charAt(2);
        if(first == last){
            System.out.println("they are the same");
        }else{
            System.out.println("not the same");
        }

        if(word.charAt(0) == word.charAt(2)){
            System.out.println("the same");
        }else{
            System.out.println("not");
        }

    String w2 = "aziza";
    char firstL = w2.charAt(0);
    char lastL = w2.charAt(w2.length() - 1);
        System.out.println(firstL);
        System.out.println(lastL);
        if(firstL == lastL){
            System.out.println("matched");
        }else{
            System.out.println("do not matched");
        }






    }
}

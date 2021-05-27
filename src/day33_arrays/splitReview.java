package day33_arrays;
import java.util.*;
public class splitReview {
    public static void main(String[] args) {

        String w = "java";
        String[] array = w.split("a");
        System.out.println(array.length); //2
        int count = array.length-1;
        if(w.endsWith("a")){
            count++;
        }
        System.out.println("count = " + count);
        System.out.println();
        System.out.println("=== split with empty string ===");
        String[] strArr = w.split("");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println(strArr[3]);
        System.out.println();

        String w2 = "java1html2sq";
        String[] str = w2.split("\\d");
        System.out.println(str[0]);
        System.out.println(Arrays.toString(str)); // [java, html, sq]
        System.out.println();
        w2 = w2.replaceAll("\\d","_");
        System.out.println("w2 = " + w2); // w2= java_html_sq
        System.out.println();

        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }

    }
}

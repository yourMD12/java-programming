package day21_string_manipulation;

import java.sql.SQLOutput;

public class ReplacePractice {
    public static void main(String[] args) {

        String word = "github";
        System.out.println(word.replace("hub","lab"));
        System.out.println("word = " + word);

        word = word.replace("hub","lab");
        System.out.println("word = " + word);
         // i-o a-i
        word.replace('i','o').replace('a','i');
        System.out.println("word = " + word);

        String sentence = "java is fun";
        System.out.println(sentence.replace(" ",""));
        //java - selenium, fun - a lot of fun + no space
        System.out.println(sentence.replace("java","selenium").replace("fun","a lot of fun").replace(" ",""));

        String result = "fhdweueu dhwjuewiwdhh jhehrjfidos 4,000 dhdgheyehd";
        result.replace("fhdweueu dhwjuewiwdhh jhehrjfidos ","")
                .replace(" dhdgheyehd","")
                .replace("4,","4");
        System.out.println(result);

        int count = Integer.parseInt(result);
        count++;
        if(count > 0);
        System.out.println("search success");






    }
}

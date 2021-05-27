package day21_string_manipulation;

public class StringIndexOf {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.indexOf("j")); //0
        System.out.println(word.indexOf("a")); //1 ONLY FIRST MATCH!!!!!!!!!!
        System.out.println(word.indexOf("g")); //-1
        System.out.println(word.indexOf("ja")); //0
        System.out.println(word.indexOf("va")); //2
    }
}

package day19_class_vs_object_strings;

public class StringNameConvertion {
    public static void main(String[] args){
        String word = "CyberTek";
        String sentence = "JAVA is fun";
        System.out.println(word); //CyberTek
        System.out.println(word.toLowerCase()); //cybertek
        System.out.println("JAVA".toLowerCase()); //java
        System.out.println(sentence.toLowerCase()); //java is fun
        word.toLowerCase();
        System.out.println(word); //CyberTek
        System.out.println(word.toLowerCase()); //cybertek

        String wordInLCase = word.toLowerCase();
        System.out.println("wordinLCase = " + wordInLCase);

        word = word.toLowerCase();
        System.out.println("word " + word);

        String company = "Amazon";
        System.out.println(company.toUpperCase()); //AMAZON1
        System.out.println("company name " + company.toUpperCase());
        System.out.println("company " + company); //company Amazon
        company = company.toUpperCase();
        System.out.println(company); //AMAZON

        System.out.println("java".toUpperCase()); //JAVA






    }
}

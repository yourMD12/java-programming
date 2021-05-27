package day19_class_vs_object_strings;

public class StringStartsWithEndsWith {
    public static void main(String[] args) {
        String word = "meow"; //the same with 2 and more words
        System.out.println(word.startsWith("me"));
        System.out.println(word.endsWith("w"));
        System.out.println(word.startsWith("Me"));
        System.out.println(word.endsWith("W"));

        String name = "Irina";
        if (name.endsWith("a")) {
            System.out.println("maybe its a female");
        }
        String firstN = "Dr. Nadir";
        if (firstN.startsWith("D")) {
            System.out.println("we have a doctor");
        } else if (firstN.endsWith("ir")) {
            System.out.println("and this one ia nadir");
        }

        String firstName = "Mr.";
        if (firstName.startsWith("Mr.")){
            System.out.println("Man");
        } else if (firstName.startsWith("Dr.")){
            System.out.println("Doctor");
        } else if (firstName.startsWith("Mrs.")){
            System.out.println("Married woman");
        } else if (firstName.startsWith("Ms.")){
            System.out.println("Single woman");
        } else if (firstName.startsWith("Sr.")){
            System.out.println("Senior");
        }
        String url = "https://hello.com";
        if(url.endsWith(".com")){
            System.out.println("commercial website");
        }else if(url.endsWith(".ru")){
            System.out.println("russian website");
        }else if(url.endsWith(".gov")){
            System.out.println("goverment website");
        }else if(url.endsWith(".edu")){
            System.out.println("education website");
        }else if(url.endsWith(".org")) {
            System.out.println("organization website");
        }





    }
}
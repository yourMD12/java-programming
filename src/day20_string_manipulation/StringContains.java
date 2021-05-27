package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i")); //true
        System.out.println(company.contains("ital")); //true
        System.out.println(company.contains("l o")); //true
        System.out.println(company.contains("a   a")); //false
        System.out.println(company.contains("j")); //false
        System.out.println(company.contains("One")); //false

        //if company contains space: company name with multiple words
        //else: single word company name

        if(company.contains(" ")){
            System.out.println("company name with multiple words");
        }else{
            System.out.println("single word company name");
        }

        String etsyTitle = "Wooden spoon | Etsy";
        if(etsyTitle.contains(" | ")){
            System.out.println("title check pass");
        }else{
            System.out.println("fail");
        }

        String firstName = "Ahmed";
        if(firstName.contains("a") && firstName.contains("e") ){
            System.out.println("done");
        }

        firstName = "Masha";
        if(firstName.contains("a") || firstName.contains("i")){
            System.out.println("this name is correct");
        }else{
            System.out.println("this name is incorrect");
        }

        String email = "hello@gmail.com";
        if(email.contains("@") && email.endsWith(".com")){
            System.out.println("good email");
        }else{
            System.out.println("invalid email");
        }

        if(email.toLowerCase().contains("d")){
            System.out.println("d is here");
        }else{
            System.out.println("d is not here");
        }





    }
}

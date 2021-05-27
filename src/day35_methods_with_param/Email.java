package day35_methods_with_param;

public class Email {
    public static void main(String[] args) {
        buildEmail("murodil","facebook");


    }
    public static void buildEmail(String name, String domain){
        name = name.replace(" ","_").toLowerCase();
        domain = domain.toLowerCase();
        System.out.println(name + "@" + domain + ".com");
        // email = name + "@" + domain + ".com";
        //sout(email);
    }
}

package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Chicago";
        System.out.println(city.equals("Chicago")); //true
        System.out.println(city.equals("chicago")); //false WE NEED EXACT MATCH
        System.out.println(city.equals("Chicago ")); //false WE NEED EXACT MATCH
        System.out.println(city.equalsIgnoreCase("Chicago")); //true
        System.out.println(city.equalsIgnoreCase("chicago")); //true
        System.out.println(city.equalsIgnoreCase("CHICAGO")); //true
        System.out.println(city.equalsIgnoreCase("Chiicago")); //false
        System.out.println(city.equalsIgnoreCase("Chi cago")); //false
        if(city.equals("CHICAGO")){
            System.out.println("equals() true");
        }else{
            System.out.println("equals() false");
        }
        if(city.equalsIgnoreCase("CHICAGO")){
            System.out.println("equals() true");
        }else{
            System.out.println("equals() false"); //GONNA BE TRUE ANYWAY,IDEA ABOVE
        }



    }
}

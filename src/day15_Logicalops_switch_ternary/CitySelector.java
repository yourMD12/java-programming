package day15_Logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        // city texas || naples -> "willing to relocate to texas"
        // else -> "not considering Seattle"
        String city = "Naples";
        if(city.equals("Texas") || city.equals("Naples")){
            System.out.println("willing to relocate to Texas os Naples");
        }else{
            System.out.println("not considering " + city);
        }
        System.out.println();
        String teacher = "Saim";
        //saim || murodil -> java class with saim
        //otherwise -> soft skill class with nadir
        if(teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("It is a java class with " + teacher);
        }else if(teacher.equals("Nadir")){
            System.out.println("Soft skill class with " + teacher);
        }else{
            System.out.println("Some class with " + teacher);
        }
        System.out.println();
        // company Google OR salary >= 100k == accept offer
        String company = "Google";
        int salary = 100_000;
        if(company.equals("Google") || salary >= 100_000){
            System.out.println("Accept offer from " + company);
        }else{
            System.out.println("Not for me, reject to " + company);
        }

    }
}

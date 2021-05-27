package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        //when hR >45 "accept", otherwise "reject"
   //     String reply = "accept";
        String reply = (hourlyRate > 45) ? "accept" : "reject";
        System.out.println("answer: " + reply);
        System.out.println();
        String todayClass = "java";
       // String teacher = "Murodil";
        String teacher = (todayClass.equals("java"))? "Murodil" : "Nadir";
        System.out.println("class today with " + teacher) ;

        boolean drive = true;
        String driving = drive ? "can drive" : "can not drive";
        System.out.println("you can drive: " + driving);


    }
}

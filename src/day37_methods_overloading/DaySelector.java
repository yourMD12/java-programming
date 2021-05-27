package day37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {

        System.out.println(getDayName(1));
        System.out.println(getDayName(5));
        System.out.println(getDayName(10));
        System.out.println();
        //loop 1-8 and call the getDayName with loop variable
        for(int i =1; i<9; i++){
            System.out.println(i + " = " + getDayName(i));
        }
        System.out.println();
        //store getDayName into variable and print it
        String today = getDayName(6);
        System.out.println(today + " is today");
        String someDay = getDayName(0);
        if(someDay == null){
            System.out.println("someDay is null for invalid day");
        }
        System.out.println(getDayNameV2(2));

    }
    public static String getDayName(int day){
        switch(day){
            case 1:
                return "mon"; //exit method
            // break; unreachable code,because return already exits the method
            case 2: return "tues";
            case 3: return "wed";
            case 4: return "thur";
            case 5: return "fr";
            case 6: return "sat";
            case 7: return " sun";
            default:
                System.out.println("error: invalid day " + day);
                return null; // nothing, no object
        }
    }
    public static String getDayNameV2(int day){
        String dayName;
        switch(day){
            case 1: dayName = "mon"; break;
            case 2: dayName = "tues"; break;
            case 3: dayName = "wed"; break;
            case 4: dayName = "thur"; break;
            case 5: dayName = "fr"; break;
            case 6: dayName = "sat"; break;
            case 7: dayName = "sun"; break;
            default:
                System.out.println("invalid day: " + day);
                dayName = null;
        }
        return dayName;
    }
}

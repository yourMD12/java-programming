package day26_loops;

public class WeekDays {
    public static void main(String[] args) {
        //loop 1-10;
        //inside loop switch statement
        // n -> 1 -> mon
        // n -> 2 -> tues....
        for(int n =1; n <= 10; n++) {
            switch (n) {
                case 1:
                    System.out.println("monday");
                    break;
                case 2:
                    System.out.println("tuesday");
                    break;
                case 3:
                    System.out.println("wednesday");
                    break;
                case 4:
                    System.out.println("thursday");
                    break;
                case 5:
                    System.out.println("friday");
                    break;
                case 6:
                    System.out.println("saturday");
                    break;
                case 7:
                    System.out.println("sunday");
                    break;
                default:
                    System.out.println("no such day,its Java day");
                    break;
            }

        }
        System.out.println();
        String word = "java";
        word.length(); //4

    }
}

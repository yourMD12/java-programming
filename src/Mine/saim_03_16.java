package Mine;
import java.util.Scanner;
public class saim_03_16 {
    public static void main(String[] args) {
        //      Scanner scan = new Scanner(System.in);
        //       System.out.println("Enter grade number:");
        //       int grade = scan.nextInt();
        //       String location;
        //       int groups = 0;
        //       String teacher;
        //       switch(grade){
//            case 1:
//                location = "Apple orchard";
        //               groups = 3;
        //               teacher = "Ms.Smith";
//                System.out.println("for grade number " + grade + ":\nlocation: " + location + "\ngroups: " + groups + "\nteacher: " + teacher);
//                break;
        //           case 2:
        //               location = "Zoo";
        //               groups = 7;
        //               teacher = "Mr.Lee";
        //               System.out.println("for grade number " + grade + ":\nlocation: " + location + "\ngroups: " + groups + "\nteacher: " + teacher);
        //               break;
//            case 3:
        //               location = "Aquarium";
        //            groups = 5;
        //              teacher = "Ms.Wilson";
        //               System.out.println("for grade number " + grade + ":\nlocation: " + location + "\ngroups: " + groups + "\nteacher: " + teacher);
//                break;
        //      case 4:
        //               location = "Movie theater";
//                groups = 2;
//                teacher = "Ms.Reyes";
        //               System.out.println("for grade number " + grade + ":\nlocation: " + location + "\ngroups: " + groups + "\nteacher: " + teacher);
        //               break;
        //           case 5:
        //               location = "Museum";
        //               groups = 5;
        //               teacher = "Ms.Lela";
        //              System.out.println("for grade number " + grade + ":\nlocation: " + location + "\ngroups: " + groups + "\nteacher: " + teacher);
        //              break;
        //          case 6:
        //               location = "Six Flags";
        //               groups = 8;
        //               teacher = "Mr.Watt";
        //               System.out.println("for grade number " + grade + ":\nlocation: " + location + "\ngroups: " + groups + "\nteacher: " + teacher);
        //               break;
        //      }

        System.out.println();
        String types = "US"; //EU
        if(types.equals("US") || types.equals("us")){
            boolean isMorning = false;
            if(isMorning){
                System.out.println("Class times are 10-5 EST. M, T, Th, F");
            }else{
                System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
            }
        }else if(types.equals("EU") || types.equals("eu")){
            System.out.println("Class times are  10-5 EST. M, T, W, Th, F");
        }else{
            System.out.println("Invalid Batch Type");
        }
        System.out.println();
        System.out.println("Enter age:");
        int age = 2;
        if(age < 120 && age > 0){
                if(age <= 2){
                    System.out.println("infant");
                }else if(age >= 3 && age <= 5){
                    System.out.println("toddler");
                }else if(age >= 6 && age <= 9){
                    System.out.println("kid");
                }else{
                    System.out.println("older");
                }
        }else{
            System.out.println("invalid entry");
        }
        System.out.println();
        int age1 = 19;
        String country = "USA";
        if(country.equals("USA")){
            if(age1 >= 18){
                System.out.println("you can vote");
            }else{
                System.out.println("you must be at least 18 years old");
            }
        }else{
            System.out.println("you must be US citizen");
        }
        System.out.println();
        int salary = 50_000;
        int score = 700;
        String loan = (salary >= 60_000 && score >= 650) ? "loan approved" : " loan denied";
        System.out.println("your " + loan);
        System.out.println();
        String sport = "tennis";
        int fee = (sport.equals("tennis") || sport.equals("soccer")) ? 100 : 50;
        System.out.println("you need to pay fee $" + fee);






    }
}

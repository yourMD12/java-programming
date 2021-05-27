package Mine;
import java.util.Scanner;
public class ProblemSet01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 //1
  //      System.out.println("How many people do you live with?");
 //       int people = scan.nextInt();
  //      if(people <= 2){
//            System.out.println("Live with less than 2 people");
 //       }else if(people > 2 && people < 6){
 //           System.out.println("Live with 3 -6 people");
  //      }else if(people >= 6){
  //          System.out.println("Live with more than 6 people");
 //       }
 //       System.out.println("What city do you live?");
 //       String city = scan.next();
//        System.out.println("Do you live in downtown?");
 //       boolean downtown = scan.nextBoolean();
 //       if(downtown == true) {
  //          System.out.println("Have you thought about moving to the suburbs?");
//            boolean suburbs = scan.nextBoolean();
 //           if (suburbs == true) {
 //               System.out.println("Do it, it's great");
 //           } else {
 //               System.out.println("You should think about it");
 ///          }
 //       }
   //     System.out.println("What is your favorite animal?");
 //       String animal = scan.next();
 //       System.out.println("Wow " + animal + "is a great animal");
 //       System.out.println("How many pets do you want?");
 //       int pets = scan.nextInt();
 //       System.out.println("Interesting, do you want " + pets + " " + animal +"?");

 //2
//        System.out.println();
//        int a = 3;
//        int b = 2;
//        long c = (a-- + b) * 2 / 3 % 2;
//        System.out.println(a);//2 but here already 2
//        System.out.println(b);//2
//        System.out.println(c);// 3+2 and bla bla bla =1
//3 ??????
//        System.out.println();
//        int n1 = 10;
//        int n2 = n1++ * 3 + ++n1 + n1++ % 2;
 //       int biggest = n1 > n2 ? n1 : n2;
//        System.out.println(n1); //13 ????????????? 13
//        System.out.println(n2); //10*3 + 11 + 10%2=42 ???????
//        System.out.println(biggest); //n2
//4
//        System.out.println();
 //       char l1 = 529;
//        System.out.println(l1);
//5
        System.out.println();
        System.out.println("Enter the year: ");
        int year = scan.nextInt();
        if(year <= 0 || year > 2021){
            System.out.println("invalid year");
        }else if(year >= 1346 && year <= 1353){
            System.out.println("The Black Death");
       }else if(year >= 1665 && year <= 1666){
            System.out.println("Great Plague of London");
        }else if(year >= 1770 && year <= 1772){
            System.out.println("Russian plague");
        }else if(year >= 1889 && year <= 1890){
            System.out.println("Flu pandemic");
        }else if(year == 1916 ){
            System.out.println("American polio epidemic");
        }else if(year >= 1918 && year <= 1920){
            System.out.println("Spanish Flu");
        }else if(year >= 2009 && year <= 2010){
            System.out.println("H1N1 Swine Flu pandemic");
        }else if(year >= 2014 && year <= 2016){
           System.out.println("West African Ebola epidemic");
        }else if(year >= 2020 && year <= 2021) {
            System.out.println("COVID-19");
        }else{
            System.out.println("no Pandemic");
        }
//6
        System.out.println();
        String citizenship = "yes";
        boolean resident = true;
        boolean diploma = true;
        int age = 19;
        if(citizenship.equals("no") || resident == false) {
            System.out.println("You must be a U.S. citizen or a resident");
        }
            if(age < 18 && age > 35) {
                System.out.println("Your age must be between 18 to 35 years old");
            }
                if(diploma == false){
                    System.out.println("You must have a high school diploma");
                }
                if(citizenship.equals("yes") && resident == true && age >= 18 && age <= 35 && diploma == true){
            System.out.println("You are qualified for the US Army");
        }
//7
        System.out.println();
                double hourlyRate = 40;
                int weeklyHours = 30;
                int numWeeks = 40;
                double salary = hourlyRate * weeklyHours * numWeeks;
                if(hourlyRate <= 0){
                    System.out.println("Hourly Rate cannot be Negative or Zero");
                }
                if(weeklyHours <= 0 || weeklyHours > 65){
                    System.out.println("Weekly Hours cannot be less than 1 or greater than 65");
                }
                if(numWeeks < 1 || numWeeks > 52){
                    System.out.println("Number of weeks cannot be less than 1 or greater than 52");
                }
                else{
                    System.out.println("Your salary is $" + salary);
                }
//8
                System.out.println();
                int time = 9;
                String dayOrNight = (time > 0 && time <11 ) ? "night" : "morning";
                System.out.println(dayOrNight);
//9
                System.out.println();
                String house = "tree house";
                int max;
                switch(house) {
                    case "tree house":
                        max = 1;
                        System.out.println("house type: " + house + " : " + max);
                        break;
                    case "mobile home":
                        max = 2;
                        System.out.println("house type: " + house + " : " + max);
                        break;
                    case "apt":
                        max = 4;
                        System.out.println("house type: " + house + " : " + max);
                        break;
                    case "town house":
                        max = 6;
                        System.out.println("house type: " + house + " : " + max);
                        break;
                    case "villa":
                        max = 8;
                        System.out.println("house type: " + house + " : " + max);
                        break;
                    case "mansion":
                        max = 10;
                        System.out.println("house type: " + house + " : " + max);
                        break;
                }
//10
        System.out.println();
                String day = "mon";
                switch(day){
                    case "mon" : case "tues" : case "wed":
                        System.out.println("Office hours at 5:30 -6:45 EST");
                        break;
                    case "thur":
                        System.out.println("Soft Skills day");
                        break;
                    case "fr":
                        System.out.println("day off");
                        break;
                    case "sat" : case "sun":
                        System.out.println("Already a long day, no office hours");
                        break;
                    default:
                        System.out.println("Invalid day given");
                }
//11
        System.out.println();
              byte level = 18;
              if(level >=1 && level <=5){
                  System.out.println("Elementary school");
              }else if(level >=6 && level <=8){
                  System.out.println("Middle school");
              }else if(level >=9 && level <=12){
                  System.out.println("High school");
              }else if(level >=13 && level <=16) {
                  System.out.println("College");
              }else if(level >=17 && level <=18){
                  System.out.println("Invalid grade level given");
              }
    }
}


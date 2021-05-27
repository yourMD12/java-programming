package Mine;
import java.util.Scanner;
public class saim3_03_10_21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//1        System.out.println("Enter number of angles: ");
//        int ang1 = scan.nextInt(); //A triangle is valid if the sum of all the three angles is equal to 180 degrees.
//        int ang2 = scan.nextInt();
//        int ang3 = scan.nextInt();
//        int sum = ang1 + ang2 + ang3;
//        if(sum == 180){
//            System.out.println("Valid triangle");
//        }else{
//            System.out.println("Not a valid triangle");
//        }
//       ======================================
//2        System.out.println("Enter year:"); //Create a program that will accept a year. Check if the year is a leap year.
//        int year = scan.nextInt();
//        int leapYear = year % 4;
//        if(leapYear == 0){
//            System.out.println(year + " year is a leap year");
//       }else{
//           System.out.println(year + " year is not a leap year");
//       }
//        ===========================================
//3        System.out.println("Enter your salary:"); //Write a program that will accept your salary amount. Then also ask the user if they are full time or not (boolean).
//        int salary = scan.nextInt();
//        System.out.println("Do your work full time?");
//        boolean isFullTime = scan.nextBoolean();
//        if(isFullTime == true){
//            System.out.println("your final salary: " + (salary +20_000));
//        }else{
//            System.out.println("your final salary: " + (salary + 5_000));
//        }
//       ================================================
//4
//        System.out.println("Enter your score: "); //Write a program that will give the grade after the retake. The program should read a score of the test and which attempt it was.
//        double score = scan.nextDouble();
//        System.out.println("Enter number of your attempts: ");
//        int num = scan.nextInt();
//        if(num == 1){
//            double percentage1 = score * 0.1;
//            double grade1 = score - percentage1;
//            System.out.println("Your grade is: " + grade1);
//        }else if(num == 2){
//            double percentage2 = score * 0.2;
//            double grade2 = score - percentage2;
//            System.out.println("Your grade is: " + grade2);
//        }else if(num ==3){
//            double percentage3 = score * 0.35;
//            double grade3 = score - percentage3;
//            System.out.println("Your grade is: " + grade3);
//        }
//        ====================================================
//5
        System.out.println("Enter the level of your oxygen tank: ");
        int level = scan.nextInt();//You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level
        if(level > 90){
            System.out.println("Your tank is full");
        }else if(level >= 80){
            System.out.println("Still okay");
        }else if(level >= 70){
            System.out.println("Don't go too far");
        }else if(level >= 60){
            System.out.println("Start to head back");
        }else if(level >= 50){
            System.out.println("Be careful now, you are at 50%");
        }

    }

}

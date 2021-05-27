package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
        //15 stars with space
        for(int star = 1 ; star < 16; star++){
            System.out.print("* ");
        }
        System.out.println();
        String myStars = "";
        //fill 5 stars to myStars variable
        for(int myStar = 0; myStar <5; myStar++){
            myStars +="* ";
            System.out.println("my stars " + myStars);
        }
        System.out.println("my stars " + myStars);//myStars.trim()--GONNA BE WITHOUT LAST SPACE



    }
}

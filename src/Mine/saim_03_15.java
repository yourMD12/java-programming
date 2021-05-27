package Mine;
import java.util.Scanner;
public class saim_03_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int judge = 1;
        System.out.println("Enter judge " + judge++ + " score");
        int score1 = scan.nextInt();
        System.out.println("Enter judge " + judge++ + " score");
        int score2 = scan.nextInt();
        System.out.println("Enter judge " + judge++ + " score");
        int score3 = scan.nextInt();
        System.out.println("Enter other person 1's score:");
        int otherPerson = scan.nextInt();
        System.out.println("Enter other person 2's score:");
        int otherPerson2 = scan.nextInt();
        int ourAverageScore = (score1 + score2 + score3) / 3;
        if(ourAverageScore > otherPerson && ourAverageScore > otherPerson2){
            System.out.println("First place");
        }else if((ourAverageScore > otherPerson && ourAverageScore < otherPerson2) || (ourAverageScore < otherPerson && ourAverageScore > otherPerson2)){
            System.out.println("Second place");
        }else{
            System.out.println("Third place");
        }

//You are in a baking contest. Your cookies will be rated by 3 judges. The 3 scores from the judges will be averaged and compared with the 2 other people in the contest.
//Use variables: judge score 1, judge score 2, judge score 3, other person score 1, other persons score 2
//If your score is more than both of the other people then print "First place!"
//If your score is more then one other person then print "Second place"
//If your score is less than both of the other people then print "Third place"
        String color = "Green light";
        switch(color){
            case("Green light"):
                System.out.println("Go");
                break;
            case("Yellow light"):
                System.out.println("Slow down");
               break;
            case("Red light"):
                System.out.println("Stop");
                break;
        }
           System.out.println();


        System.out.println();
        String name = "Canyon";
        int price = 0;
        double rate = 0.0;
        String gated; //boolean gated;
        String  pets;//boolean pets;
        switch(name){
            case "Hills":
                price = 89000;
                rate = 4.0;
                gated = "no";
                pets = "yes";
                System.out.println("Name: " + name + "\nprice: " + price + "\nrate: " + rate + "\ngated: " + gated + "\naloow pets: " + pets);
                break;
            case "Oaks":
                price = 75000;
                rate = 3.5;
                gated = "no";
                pets = "yes";
                System.out.println("Name: " + name + "\nprice: " + price + "\nrate: " + rate + "\ngated: " + gated + "\naloow pets: " + pets);
                break;
            case "Highland":
                price = 150000;
                rate = 4.5;
                gated = "yes";
                pets = "no";
                System.out.println("Name: " + name + "\nprice: " + price + "\nrate: " + rate + "\ngated: " + gated + "\naloow pets: " + pets);
                break;
            case "Canyon":
                price = 201000;
                rate = 4.8;
                gated = "yes";
                pets = "yes";
                System.out.println("Name: " + name + "\nprice: " + price + "\nrate: " + rate + "\ngated: " + gated + "\naloow pets: " + pets);
                break;
        }
        System.out.println();
        System.out.println();
        String genre = "Fantasy";
        int page;
        int profit;
        int sequels;
        int countries;
        switch(genre){
            case "Fantasy":
                page = 500;
                profit =1000000;
                sequels = 5;
                countries =50;
                System.out.println("Genre: " + genre + "\npage: " + page + "\nprofit: " + profit + "\nsequels: " + sequels + "\ncountries: " + countries);
                break;
            case "Detective":
                page = 350;
                profit =700000;
                sequels = 3;
                countries =45;
                System.out.println("Genre: " + genre + "\npage: " + page + "\nprofit: " + profit + "\nsequels: " + sequels + "\ncountries: " + countries);
                break;
            case "Science Fiction":
                page = 720;
                profit =900000;
                sequels = 4;
                countries =30;
                System.out.println("Genre: " + genre + "\npage: " + page + "\nprofit: " + profit + "\nsequels: " + sequels + "\ncountries: " + countries);
                break;
            case "Short Story":
                page = 150;
                profit =300000;
                sequels = 1;
                countries =40;
                System.out.println("Genre: " + genre + "\npage: " + page + "\nprofit: " + profit + "\nsequels: " + sequels + "\ncountries: " + countries);
                break;
        }


    }
}

package day36_methods_with_returns;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(815);
        System.out.println(getCreditScore()); //800
        System.out.println("score = " +  getCreditScore()); //score=800
        int score = getCreditScore();
        System.out.println("score= " + score); //score =800

    }
    public static void checkEligible(int creditScore){
        if(creditScore >= 700){
            System.out.println("you are eligible for this car");
        }else{
            System.out.println("sorry,next time");
        }
    }
    public static int getCreditScore(){
        return 800;
    }
}

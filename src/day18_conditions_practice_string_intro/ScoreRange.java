package day18_conditions_practice_string_intro;

public class ScoreRange {
    public static void main(String[] args) {
        //1-40 D, 40-60 C, 60-90 B, 90-100 A else- invalid score
        int score = 91;
        if(score >= 1 && score <= 40){ //if(score>=1 || score <= 40){ WILL BE "D",DOESNT MATTER WHICH NUMBER,CAUSE IF >1
            System.out.println("D");
        }else if(score > 40 && score <= 60){
            System.out.println("C");
        }else if(score > 60 && score <= 90){
            System.out.println("B");
        }else if(score >90 && score <= 100){
            System.out.println("A");
        }else{
            System.out.println("invalid score");
        }
        System.out.println();
        int num1 = 100;
        int num2 = 44;
        int num3 = 11;
        if(num1 > num2 && num1 > num3){
            System.out.println("biggest number is " + num1);
        }else if(num2> num1 && num2 > num3){
            System.out.println("biggest number is "+ num2);
        }else{
            System.out.println("biggest number is " + num3);
        }
    }
}

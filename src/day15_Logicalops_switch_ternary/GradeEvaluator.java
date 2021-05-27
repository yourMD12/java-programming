package day15_Logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        //grade= A,B,C,D,E
        //if grade A||B||C -> passed
        //if D -> qualify for retake
        //if E -> fail
        // otherwise -> invalid grade
        System.out.println("Enter your grade: ");
        char grade = 'A';
        if(grade == 'A' || grade == 'B' || grade == 'C'){
            System.out.println("passed");
        }else if(grade =='D'){
            System.out.println("qualify for retake");
        }else if(grade == 'E'){
            System.out.println("fail");
        }else{
            System.out.println("invalid grade");
        }




    }
}

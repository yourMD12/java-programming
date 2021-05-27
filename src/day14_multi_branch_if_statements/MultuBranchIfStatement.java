package day14_multi_branch_if_statements;

public class MultuBranchIfStatement {
    public static void main(String[] args) {
        int day = 5;
        if(day == 1){
            System.out.println("Monday");
        }else if(day ==2){
            System.out.println("Tuesday");
        }else if(day == 3){
            System.out.println("Wednesday");
        }else{
            System.out.println("No matches");
        }
        // OR LONGER WAY:
        // if(day == 1){
        //sout("mon");
        //}else{
        //sout("not mon");
        //}
        //if(day == 2){
        //sout("tues");
        //}else{
        //sout("not tues");
        //} etc

    }
}

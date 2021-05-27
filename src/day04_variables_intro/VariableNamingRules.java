package day04_variables_intro;

public class VariableNamingRules {
    public static void main(String[]args){
        //int static = 22; -> error, static is reserved by java
        int static2 = 22;
        int _static = 92;
        int $tatic = 27;
        int staticVar = 234;

        int salary$ = 55;
        //int 1stMonthsalary = 3000 -> error,can't start with number
        int $ = 10;
        int _ =3;
        //they are work but not recommended
        //we should use meaningful variable names
        //int number-of-friends = 400; -> error
        int numberOfFriends = 401;
        int number_of_friends = 400; //not convention
        int num1 = 10; //works well
       // int 1stnumber = 10; //ERROR



    }
}

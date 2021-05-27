package day12_conditional_statemnets;

public class CompareChars {
    public static void main(String[] args) {
        char letter1 ='A';
        char letter2 ='J';
        System.out.println(letter1 == letter2);//65==74
        System.out.println(letter1 > letter2);//65>74
        System.out.println(letter1 < letter2);//65<74
        char grade = 'E';
        boolean pass = grade <= 'A';
        System.out.println("Did you pass the exam? = " + pass);
    }
}

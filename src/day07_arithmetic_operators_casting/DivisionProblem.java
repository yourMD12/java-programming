package day07_arithmetic_operators_casting;

public class DivisionProblem {
    public static void main (String [] args){
        System.out.println(10 /3 );  //3
        System.out.println(5 / 2); //2
        int num = 40;
        int num2 = 15;
        System.out.println(num / num2);//2
        System.out.println(5.0 / 2.0); //2.5
        System.out.println(5.0 / 2); //2.5
        double d1 = 12;
        double d2 = 3;
        System.out.println(d1 / d2); //4.0

        int count = 100;
        double dCount = 30.0;
        System.out.println(count / dCount); //3.33333...

        double d3 = 12.0;
        double d4 = 5.0;
        System.out.println(d3 / d4); //2.4

        int n1 = 4;
       // byte b1 = n1; // IT WILL NOT WORK,CAUSE BYTE IS SMALLER THAN INT,SO WE NEED TO CAST IT
        System.out.println();
        byte b2 =55;
        int n2 =b2; //THIS ONE WILL WORK OK CAUSE INT IS BIGGER THAN BYTE













    }
}

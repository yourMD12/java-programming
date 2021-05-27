package day08_casting_scanner;

import java.sql.SQLOutput;

public class CastingExamples {
    public static void main ( String [] args){
        // byte short int long
        byte num1 = 100;
        short num2 = num1;
        int num3 = num1;
        int num4 = 1000;
        long num5 = num4;
        float num6 = 124.4F;
        double num7 = num6;

        int num8 = 3456; //3456
        double num9 = num8;//3456.0
        System.out.println(num8);

        long nuM = 4444L;
        int nuM1 = (int)nuM; //WITHOUT CAST IT WILL NOT WORK
        System.out.println("===============");
        int num10 = 22;
        byte num11 = (byte)num10;
        short num12 = (short)num10;
        System.out.println("num10 " + num10);
        System.out.println("num11 " + num11);
        System.out.println("num12 " + num12);

        double num15 = 1234.5;
        int num16 = (int)num15;
        System.out.println(num16);//FOR NUM15 1234.5 AND FOR NUM16 1234
        System.out.println();
        char letter = 'M'; //77
        int numLetter = letter;
        System.out.println(numLetter);





    }
}

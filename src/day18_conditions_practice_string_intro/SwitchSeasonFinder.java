package day18_conditions_practice_string_intro;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class SwitchSeasonFinder {
    public static void main(String[] args) {
        int month = 2;
        switch(month){
            case 12 : case 1 : case 2 :
                System.out.println("winter");
                break;
            case 3 : case 4 : case 5 :
                System.out.println("spring");
                break;
            case 6 : case 7 : case 8 :
                System.out.println("summer");
                break;
                case 9 : case 10 : case 11 :
                System.out.println("fall");
                break;
        }
        System.out.println();
        int num1 = 10;//20 or 30
        int num2 = 10;
        switch(num1){
            case 10:
                num1++; //11
                num2 += 10; //20
                break;
            case 20:
                num1 += num2; //30 //IF WITH BREAK 30
                num2--; //9 //IF WITH BREAK 9
            case 30:
                num1 = 0; //0
                num2 -= 3; //6
                break;
        }
    }
}

package Mine;
import java.util.Scanner;
public class saim_03_27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//1
        int count = 5;
        int numInQuestion = 1;
        while(numInQuestion < 101){
            if(numInQuestion %2 ==0){
                count += numInQuestion;
            }
            numInQuestion++;
        }
        System.out.println("sum of even numbers: " + count);
        System.out.println();
        // for(numInQuest = 1; numInQues <101;numOfNum++)
//2
        int count2 = 7;
        int num =3;
        while(num <101){
            if(num %2 !=0){
                count2 +=num;
            }
            num++;
        }
        System.out.println("sum: " + count2);
        System.out.println();
//3
        int num2 = 50;
        while(num2 < 101 && num2 %3 ==0 && num2 %5 ==0 & num2 %2 !=0){
            num2++;
        }
        System.out.println("sum: " +num2);
        System.out.println();
//4
        int num3 = 0;
        while(num3 < 101 && num3 %3 ==0 && num3 %5 ==0 & num3 %2 ==0){
            num3++;
        }
        System.out.println("sum: " +num3);
        System.out.println();
//5
        System.out.println("enter Upper or Lower:");
        String uOrL = scan.next();
        System.out.println("do u want yo see that ascending or descending?");
        String asOeDes = scan.next();
        if(uOrL.equalsIgnoreCase("upper") && asOeDes.equalsIgnoreCase("ascending")){
            for(char i = 'A'; i <= 'Z'; i++){
                System.out.print(i + " ");
            }
        }else if(uOrL.equalsIgnoreCase("upper") && asOeDes.equalsIgnoreCase("descending")){
            for(char i = 'Z'; i >= 'A';i--){
                System.out.print(i + " ");
            }
        }
        if(uOrL.equalsIgnoreCase("lower") && asOeDes.equalsIgnoreCase("ascending")){
            for(char i = 'a'; i <= 'z'; i++){
                System.out.print(i + " ");
            }
        }else if(uOrL.equalsIgnoreCase("lower") && asOeDes.equalsIgnoreCase("descending")){
            for(char i = 'z'; i >= 'a';i--){
                System.out.print(i + " ");
            }
        }
//6
        System.out.println();
        System.out.println("enter a number");
        int num1 = scan.nextInt();
        int max = num1;
        int min = num1;
        for(int i = 0; i<4; i++){
            System.out.println("enter a number:");
            int num5 = scan.nextInt();
            if(num5 > max){
                max=num5;
            }
            if(num5 < min){
                min = num5;
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);




    }
}


//[Max and Min from 5 numbers]
// •Write a program that can ask the user "enter a number" five times and return the maximum number
// •Write a program that can ask the user "enter a number" five times and return the minimum number
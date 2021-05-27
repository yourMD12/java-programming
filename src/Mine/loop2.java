package Mine;
//import java.util.Scanner;
import java.util.*;
public class loop2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

////1                               0123
//        String w = scan.next(); //java
//        String pal ="";
//        for(int i = w.length()-1; i >=0; i--){
//            pal += w.charAt(i);
//        }
//        if(w.equals(pal)){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }
//
////2
//        String w1 = scan.next();
//        int upC = 0;
//        int lowC = 0;
//        int num = 0;
//        for(int i =0; i<= w1.length()-1; i++){
//            char letter = w1.charAt(i);
//            if(w1.charAt(i) >= 'A' && w1.charAt(i) <= 'Z'){
//                upC++;
//            }else if(w1.charAt(i) >= 'a' && w1.charAt(i) <= 'z'){
//                lowC++;
//            }else if(w1.charAt(i) >= '0' && w1.charAt(i) <= '9'){
//                num++;
//            }
//        }
//        System.out.println("uppercase letters: " + upC);
//        System.out.println("lowercase letters: " + lowC);
//        System.out.println("numbers: " + num);
//        System.out.println();
//
////3
//        String word = "aaabbbcccccddddee";
//       int max =0;
//       int count =0;
//       char biggestChar = 'a';
//       for(int i=0; i<word.length() ; i++){
//           count =0;
//           for(int j =0; j< word.length(); j++){
//               if(word.charAt(i) == word.charAt(j)){
//                   count++;
//                   if(count > max){
//                       max = count;
//                       biggestChar = word.charAt(i);
//                   }
//               }
//           }
//       }
//        System.out.println(biggestChar + max);

////4
//        Random random = new Random();
//        String randNum = "";
//        while(randNum.length() != 6){
//            int eachRandom = random.nextInt(10); //0-9
//            if(!randNum.contains("" + eachRandom)){
//                randNum += eachRandom;
//            }
//        }
//        System.out.println("password: " + randNum);




//        String var = ""; //""0123456789";
//        Random random = new Random();
//        String password = "";
//      // for(int i =0; i<=5;i++){
//       //    System.out.println(random.nextInt(var.length()));
//      // }
//       for(int i=0 ;i <=var.length(); i++) {
//           int index = random.nextInt(var.length());
//           //   System.out.println(var.charAt(index));
//           if (!password.contains(var.charAt(index) + "")) {
//               password += var.charAt(index);
//           }
//       }
//        System.out.println("password: " + password);




        //CHALLENGE–THIS WILL MAY BE DIFFICILT BUT TRY IT. DON’T SPEND TOO MUCH TIME
// Generate a random number that is six digits long.
// Each digit in this number should be unique,
// meaning the number 6 digit number should have 6 different character numbers
// that make it up. Print the number. HINTS: Loops, Strings, Random


//3    way3
//        String word = "aaaaaaaaaaahhhhhhhhhddddddddduuuuuuuuu";
//        int counter = 1;
//        int countMax = 1;
//        String subWord = "";
//        int lastLetter =0;
//        for(int i = 0; i < word.length()-1; i++){
//            if(word.charAt(i) == word.charAt(i +1)){
//                count++;
//                if(count > countMax){
//                    countMax = count;
//                    lastLetter = (i); // when it comes to here countMax already 2, e=i reads from index 0
//                }
//            }else if(word.charAt(i) != word.charAt(i +1)){
//                count =1;
//            }
//        }
//        subWord = word.substring(lastLetter - countMax +2, lastLetter +2);
//        System.out.println(countMax + " characters in longest substring " +subWord);
    }
}
//Biggest substring of matching characters
// Given a String find the biggest substring
// of chars that match and print it.
// Ex: aaabbbcccccddddee Output: ccccc

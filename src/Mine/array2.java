package Mine;
import java.util.*;
import java.util.Scanner;
public class array2 {
    public static void main(String[] args) {

//1
        int[] nums = {1,2,-3,4,-34,55,78,90,33,10};
        //int size =nums[0];
        String even = "";
        String odd = "";
        for(int i =0; i< nums.length; i++){
        if(nums[i] %2 ==0) {
            even += nums[i] + ", ";
        }
         if(nums[i] %2 !=0){
             odd += nums[i] + ", ";
        }
    }
        System.out.println(Arrays.toString(even.split(", ")));
        System.out.println(Arrays.toString(odd.split(", ")));
//2
        System.out.println();
        String[] names = {"Mike", "Joe", "Ana", "Ali", "Joanna"};
        int[] score = {80, 54, 100, 66, 94};
        char[] grade =new char[names.length];
        for(int i =0; i<100; i++) {
            if (score[i] >= 85) {
                grade[0] = 'A';
            } else if (score[i] > 75 && score[0] < 84) {
                grade[0] = 'B';
            } else if (score[i] > 65 && score[0] < 74) {
                grade[0] = 'C';
            } else {
                grade[0] = 'D';
            }
        }


        //Gradebook ( Similar to MaxMinPricefrom class)
        // Declare three arrays: 1.String array which will hold names for the students (give values)
        // 2.Int array which has the score of the student got in the quiz (give values)
        // 3.Char array which will have some letter grade based on the score (empty
        // 4.Output the gradebook at the end with all the information
        // Grade scale:Above85: A Above75:B Above 65: C Other: D
        //Example:Names = []
        // Scores = []
        // Grades=[‘B’, ‘D’, ‘A’, ‘C’, ‘A’] -> Need to find and store these based on score
        // Output:Mike |80 | B; Joe|54|D ; Ana | 100 | A ;Ali|66 | C ;Joanna | 94 | A

//3
        System.out.println();
        String w = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[] newW = w.split(", ");
        for(String each : newW){
            if(each.contains(" ")){
                System.out.println(each);
            }
        }
//4
        System.out.println();
        //longest palindrome
        String[] words = {"java", "longer word", "civic" ,"apple", "racecar", "mom", "anna"};
        String longest = "";
        for(String word : words){
            boolean isPalindrome = true;
            for(int i =0; i< word.length()/2; i++){
                if(word.charAt(i) != word.charAt(word.length()-1-i)){
                    isPalindrome = false;
                    break;
                }
            }
            if(isPalindrome && word.length() > longest.length()){
                longest = word;
            }
        }
        System.out.println(longest.isEmpty() ? "no palindrome" : longest);

//5         second biggest number
        System.out.println();
        //Input: [4,3,1,4,5,2,4,8,4,8]  Output:5
        int[] nums2 = {4,3,1,4,5,2,4,8,4,8};
        int max = nums2[0];
        int second = nums2[0];
        for(int each : nums2){
            if(each > max){
                max = each;
            }
            if(each > second && each < max){
                second = each;
            }
        }
        System.out.println(second);






    }
}

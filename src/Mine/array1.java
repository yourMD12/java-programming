package Mine;
import java.util.Scanner;
import java.util.*;
public class array1 {
    public static void main(String[] args) {

//1
        // FOR LOOP
        int[] nums = new int[100];
        int idx = 1;
        for(int i=0; i< nums.length; i++){
            nums[i] =idx;
            idx++;
            System.out.print(nums[i] + " ");
        }
        // FOR EACH LOOP
        System.out.println();
        int[] nums2 = new int[100];
        for(int i =0; i< nums2.length; i++){
            nums2[i] +=i+1;
        }
        for(int each : nums2){
            System.out.print(each + " ");
        }


//2
        System.out.println();
        int[] num = {13,5,27,85,30,75,328};
        int max =num[0];
        int min = num[0];
        for(int i =0; i < num.length; i++){
            if(num[i] > max){
                max = num[i];
            }
            if(num[i] < min){
                min = num[i];
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);

//3
        System.out.println();
        Scanner scan =new Scanner(System.in);
        System.out.println("choose your size:");
        int size = scan.nextInt();
        int[] arr = new int[size];
        int sum =0;
        System.out.println("enter your numbers:");
        for(int i =0; i< size; i++){
            arr[i] = scan.nextInt();
            sum +=arr[i];
        }
        System.out.println("average: " + sum/arr.length);

//4
        System.out.println();
        int[] num2 = {10,4,24,35,47,58,76,56,79};
        int countEven =0;
        int countOdd =0;
        for(int each : num2){
            if(each % 2 ==0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        System.out.println("number of even: " + countEven);
        System.out.println("number of odd: " + countOdd);

//5
        System.out.println();
        String[] words = {"hello", "hi", "why", "water", "computer"};
        String l = words[0];
        String sh = words[0];
        int count4 =0;
        for(String each : words){
            if(each.length() > l.length()){
                l = each;
                count4++;
            }
            if(each.length() < sh.length()){
                sh = each;
                count4++;
            }
        }
        System.out.println("longest word: " + l);
        System.out.println("shortest word: " + sh);

    }
}

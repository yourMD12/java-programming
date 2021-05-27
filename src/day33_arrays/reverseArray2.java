package day33_arrays;
import java.util.*;
public class reverseArray2 {
    public static void main(String[] args) {

        int num1 =10; //10
        int num2 = 30; //30
        //swap those using additional variable
        int temporary = num1;
        num1 = num2;
        num2 = temporary;
        System.out.println(num1 + " " + num2); //30 10

        int[] nums = {5,10,4,100};
        System.out.println("before swap: " + Arrays.toString(nums)); //[5,10,4,100]
        int temp = nums[0];
        nums[0] = nums[3];
        nums[3] = temp;
        System.out.println(Arrays.toString(nums)); // [100,10,4,5]

        int[] nums2 = {5,10,4,100};
        for(int i =0; i < nums2.length/2; i++){
            int temp2 = nums2[i];
            nums2[i] = nums2[nums2.length - 1 - i];
            nums2[nums2.length - 1 - i] = temp2;
            System.out.println("after: " + Arrays.toString(nums2)); // [100,4,10,5]
        }
        System.out.println();
        String[] words = {"java", "html", "js", "ruby", "css"};
        System.out.println("before: " + Arrays.toString(words));// [all words]
        for(int i =0, j=words.length-1; i< words.length/2; i++,j--){
            String tempWord = words[i];
            words[i] = words[j];
            words[j] = tempWord;
        }
        System.out.println("after reverse: " + Arrays.toString(words)); // [made reverse]



    }
}

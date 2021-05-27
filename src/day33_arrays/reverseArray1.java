package day33_arrays;
import java.util.*;
public class reverseArray1 {
    public static void main(String[] args) {


        int[] nums = {5,10,4,100};
        int[] numsRev = new int[nums.length]; //{0,0,0,0}
        for(int i = nums.length-1, j=0; i>=0; i--, j++){
            //System.out.print(nums[i] + " "); //100,4,10,5
            numsRev[j] = nums[i];
        }
        System.out.println(Arrays.toString(nums)); // [5,10,4,100]
        System.out.println(Arrays.toString(numsRev)); // [100,4,10,5]



    }
}

package day31_arrays;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {

        int[] nums = {-5, 23, 123, 654, 2344, 12345, 14421};
        System.out.println(Arrays.binarySearch(nums, 23)); //1
        System.out.println(Arrays.binarySearch(nums,2344)); //4
        System.out.println(Arrays.binarySearch(nums,25)); //-3
        //check if 12345 is among nums in array
        if(Arrays.binarySearch(nums, 12345) >=0){
            System.out.println("it's there");
        }else{
            System.out.println("it's not there");
        }


    }
}

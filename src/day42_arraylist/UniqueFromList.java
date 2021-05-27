package day42_arraylist;
import java.util.*;
public class UniqueFromList {
    public static void main(String[] args) {

        // declare Integer arrayList with following nums
        List<Integer> nums = new ArrayList<>(Arrays.asList(2,4,4,1,5,6,0,6));
        System.out.println(nums);//2 4 4 1 5 6 0 6
        // new arrayList to store only unique nums
        List<Integer> uniqueList = getUniqueIntegers(nums);
        System.out.println("\nuniqueList: " + uniqueList); // uniqueList: [2, 1, 5, 0]





    }

    private static List<Integer> getUniqueIntegers(List<Integer> nums) {
        List<Integer> uniqueList = new ArrayList<>();
        // loop through the list
        for(int each : nums){
            // check if num appears only ONCE in the list
            if(Collections.frequency(nums, each) == 1){
                // print that num
                System.out.print(each + " "); //2 1 5 0
                uniqueList.add(each);
            }
        }
        return uniqueList;
    }

}

package day40_arrayList;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(); //polymorphic way of declaring
        System.out.println(nums); // []
        System.out.println("nums= " + nums.size()); //0
        nums.add(2);
        nums.add(5);
        nums.add(4);
        nums.add(8);
        nums.add(9);
        nums.add(5);
        System.out.println("nums = " + nums);
        nums.remove(0); //remove by idx
        System.out.println("nums = " + nums);
        nums.remove(new Integer(5)); //remove by value,it will delete this num,not idx
        System.out.println("nums = " + nums);
        // for loop - iterate through all values and print
        for(int i = 0; i < nums.size(); i++){
            System.out.println(nums.get(i)); // 4895
        }
        //for each loop
        for(int each : nums){
            System.out.print(each + " "); //4895
        }
        //OR
        for(Integer each : nums){
            System.out.print(each + " "); //4895
        }
        
    }
}

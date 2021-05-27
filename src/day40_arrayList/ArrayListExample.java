package day40_arrayList;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5); //idx 0
        nums.add(7); //idx 1
        nums.add(11); //idx 2
        System.out.println("size: "+ nums.size()); //size : 3
        // reading from ArrayList:
        System.out.println("index 0 = " + nums.get(0)); // index 0 = 5
        System.out.println("index 1 = " + nums.get(1)); //idx = 7
        //System.out.println("index 3 = " + nums.get(3)); //idx out of bound exception

        // print all values in same line:
        System.out.println(nums); // = Arrays.toString(numArray) RESULT [5, 7, 11]

        nums.remove(1); // remove element at idx 1
        System.out.println(nums); // [5,11]

    }
}

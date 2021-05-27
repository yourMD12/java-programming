package day43_list_custom_classes;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class MethodsWithListReturn {
    public static void main(String[] args) {
        // 1 nanosec = 1_000_000_000 of a sec
        long start = System.nanoTime();

        List<Integer> mlnNums = getIntegerList(); // returns ready ArrayList object, no need new Array..
        long end = System.nanoTime(); //print duration at next line
        System.out.println("ArrayList time " + (end-start)); //27937700
        //System.out.println(mlnNums);

        long st = System.nanoTime();
        int[] next = getIntegerArray();
        long en = System.nanoTime();
        double sec = (en-st)/ 1_000_000_000.0;
        System.out.println("Array time " + (en-st)); //30206300
        System.out.println("sec = " + sec); // 0.0335...
        //System.out.println(next);


    }
    /**
     * get integer list
     * no params
     * return List<Integer>
     *     loop from 0 - 1000_000
     *     add to arrayList
     */
    public static List<Integer> getIntegerList(){
    List<Integer> nums = new ArrayList<>();
    for(int i =0; i <= 1000_000; i++){
    nums.add(i);
    }
    return nums;

 }
    /**
     *  getIntegerArray
     *  no params
     *  return int[]
     *  loop 0-1_000_000
     *  add to int[] then return it
     */

    public static int[] getIntegerArray() {
        // declare empty array with  size 1_000_001
        int[] num = new int[1_000_001];
        // loop and assign nums
        for(int i =0; i<= 1_000_000; i++){
            num[i] = i;
        }
        return num;
    }



}

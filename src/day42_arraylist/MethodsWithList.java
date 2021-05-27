package day42_arraylist;

import java.util.List;
import java.util.*;

public class MethodsWithList {
    public static void main(String[] args) {

        // declare String arrayList and add value
        List<String> words = new ArrayList<>();
        words.add("java"); words.add("html"); words.add("selenium");
        words.add("a"); words.add("input"); words.add("title");
        // pass the words list to printStrList method
        printStrList(words); //java html selenium a input title

        printStrList(Arrays.asList("select","option","br","python","sql","api")); //select option br python sql api

        System.out.println();
        List<Integer> nums = Arrays.asList(23,54,23,54554,234,11,5,2);
        int sum = sumIntegerList(nums);
        System.out.println("sum = " + sum); //sum = 54906



    }

    /**
     * methodName: printStrList
     * param: List of Strings`
     * return: void
     * prints all values separated by space in same line
     */

    public static void printStrList(List<String> stringList){ // "java","apple","coffee","tea"
        for(String str: stringList){
            System.out.print(str + " ");
        }
        System.out.println();


    }
    public static int sumIntegerList(List<Integer> list){
        int sum = 0;
        for(int i : list){
            sum +=i;
        }
        return sum;
    }
}

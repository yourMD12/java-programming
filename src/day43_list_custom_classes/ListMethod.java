package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListMethod {
    public static void main(String[] args) {
        System.out.println(getDays()); // [mon, tues, wed, thur, fr, sat, sun]
        System.out.println(getDays().get(0)); // mon
        System.out.println(getDays().size()); // 7
        List<String> dayNames = getDays();
        System.out.println(dayNames); // [mon, tues, wed, thur, fr, sat, sun]
        dayNames.add("java day");

        // removeIf method- java 8 -> accepts lambda and easy to remove without loop
        dayNames.removeIf(day -> day.length() == 4 );
        System.out.println("dayNames = " + dayNames); // dayNames = [mon, wed, fr, sat, sun, java day]

        System.out.println();
        System.out.println(getRandomList(4)); //will give u that amount of random nums from 0-100
        List<Integer> nums = getRandomList(100);
        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums = " + nums);
        nums.removeIf(n -> n<90); // remove nums less than 90
        System.out.println("nums = " + nums);

    }

    /**
     * getDays
     * no params
     * return List<String> with Mon,tues,wed...
     */

    public static List<String> getDays(){
        List<String> days = new ArrayList<>(Arrays.asList("mon","tues","wed","thur","fr","sat","sun"));
        // OR
        // days.add("mon"); days.add("tues");.....
        return days;
    }

    /**
     * getRandomList
     * param: int size
     * return List<Integer>
     *     generate random nums(0-100) the count of size & assign to List then return
     *     getRandomList(3) -> 43,12,54
     *     getRandomList(2) -> 1,4
     */
    public static List<Integer> getRandomList(int size){
        Random random = new Random(); // new Random object with 0-100 limit
        List<Integer> nums = new ArrayList<>();
        for(int i = 1; i <= size; i++){
//            int n = random.nextInt(101); // generate random, num and add to list
//            if(!nums.contains(n)){
//                nums.add(n);
//            }
            nums.add(random.nextInt(101));
        }
        return nums;
    }


}

package day42_arraylist;
import java.util.*;
public class CollectionsUtil {
    public static void main(String[] args){

        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('a','j','k','m','i','e','y','y','o'));
        System.out.println("size: " + letters.size()); //9
        System.out.println(letters); // [a, j, k, m, i, e, y, y, o]

        Collections.reverse(letters);
        System.out.println(letters); // [o, y, y, e, i, m, k, j, a]

        // find count of letters A
        System.out.println(Collections.frequency(letters,'a')); //1

        int Ycount = Collections.frequency(letters,'y');
        System.out.println(Ycount); //2

        System.out.println("max char: " + Collections.max(letters)); // max char: y
        System.out.println("max char: " + Collections.min(letters)); // min char: a

        Collections.replaceAll(letters,'a','u');
        System.out.println("after replacing: " + letters);

        Collections.sort(letters);
        System.out.println("after sort: " + letters); // after sort: [e, i, j, k, m, o, u, y, y]
        
        List<Integer> nums = Arrays.asList(23,1,43,5,234,7,-9,0,1,5,5,5,5);
        System.out.println("nums = " + nums); //nums = [23, 1, 43, 5, 234, 7, -9, 0]
        Collections.reverse(nums);
        System.out.println("nums = " + nums); // nums = [0, -9, 7, 234, 5, 43, 1, 23]

        int largest = Collections.max(nums);
        int min = Collections.min(nums);
        System.out.println("max: " + largest + " and min: " + min); //max: 234 and min: -9

        System.out.println(Collections.frequency(nums,5)); //5
        System.out.println(Collections.frequency(nums,1)); //2

        Collections.replaceAll(nums, 5, 50);
        System.out.println(nums); // [50, 50, 50, 50, 1, 0, -9, 7, 234, 50, 43, 1, 23]

        Collections.sort(nums,Collections.reverseOrder());
        System.out.println(nums);// [234, 50, 50, 50, 50, 50, 43, 23, 7, 1, 1, 0, -9]

        Collections.shuffle(nums);
        System.out.println("after shuffle: " + nums);//after shuffle: [50, 50, 50, 50, 50, 0, 234, 1, 1, -9, 23, 43, 7]


    }

}

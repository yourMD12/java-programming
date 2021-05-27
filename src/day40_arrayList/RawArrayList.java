package day40_arrayList;
import java.util.*;
public class RawArrayList {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        List list2 = new ArrayList();
        //add values
        list.add("java");
        list.add("coffee");
        list.add(1234);
        list.add(334.76);
        list.add(true);
        System.out.println(list);
        System.out.println("size= " +list.size());
    }
}

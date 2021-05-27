package day40_arrayList;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {

        List<String> shoppingList = new ArrayList<>();
        System.out.println("size " + shoppingList.size()); // size 0
        System.out.println("IsEmpty? " + shoppingList.isEmpty()); // true
        if(shoppingList.isEmpty()){
            System.out.println("list is empty, keep coding Java");
        }else{
            System.out.println("list is not empty, code Java, then go to Moll");
        }

        shoppingList.add("shoes") ;
        shoppingList.add("monitor");
        shoppingList.add("mask");
        shoppingList.add("milk");
        shoppingList.add("wooden spoon");
        shoppingList.add("book");
        if(shoppingList.isEmpty()){
            System.out.println("list is empty, keep coding Java");
        }else{
            System.out.println("list is not empty, code Java, then go to Moll");
        }
        int count = shoppingList.size();
        System.out.println("items to buy: " + count);
        System.out.println("is shoes in my list? " + shoppingList.contains("shoes")); //true
        if(shoppingList.contains("mask")){
            System.out.println("mask is in the list");
        }else{
            System.out.println("mask isn't in the list");
        }

        System.out.println("buying shoes...$80");
        shoppingList.remove("shoes");
        System.out.println("all items: " + shoppingList); //without shoes

        System.out.println("done shopping");
        shoppingList.clear(); //remove all items
        System.out.println(shoppingList); // []




    }
}

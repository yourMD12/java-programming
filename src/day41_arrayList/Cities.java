package day41_arrayList;

import java.util.ArrayList;

public class Cities {
    public static void main (String [] args){
        //declare arrayList
        ArrayList<String> cities = new ArrayList<>();
        // add values(cities) to arraylist -> add method
        cities.add("Washington DC");
        cities.add("NY");
        cities.add("Vienna");
        cities.add("Adana");
        cities.add("LA");
        //add Ashgabat to 0 index
        cities.add(0,"Ashgabat");
        //print all values in same line
        System.out.print(cities); // [Ashgabat, Washington DC, NY, Vienna, Adana, LA]
        //print 1sr and last city
        System.out.println("first city: " + cities.get(0));
        System.out.println("last city: " + cities.get(5));
        // find last idx using size()-1
        System.out.println("last cty: " + cities.get(cities.size()-1));

        //print count of items in  arrayList
        System.out.println("count of items: " + cities.size()); //count of items: 6

        int size = cities.size();
        System.out.println("size: " + size); // size: 6

        // for loop and print all values in same line
        for(int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " "); //Ashgabat Washington DC NY Vienna Adana LA
        }
        System.out.println();
        //for each loop
        for(String each : cities){
            System.out.print(each + " "); // Ashgabat Washington DC NY Vienna Adana LA
        }
        // delete from arraylist
        // 1) remove using idx; delete value at idx 3
        cities.remove(3);
        // 2) remove using object/value
        cities.remove("NY");
        System.out.println("after remove: " + cities); // after remove: [Ashgabat, Washington DC, Adana, LA]
        // delete/remove all values from list
        cities.clear();
        // make sure it's clear:
        // 1) print/spit it out
        System.out.println("cities = " + cities); // cities = []
        // 2) using isEmpty
        if(cities.isEmpty()){
            System.out.println("list is empty"); // list is empty
        }
        // 3) check size
        if(cities.size() == 0){
            System.out.println("list is empty");
        }


    }
}

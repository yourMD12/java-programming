package day35_methods_with_param;

import java.sql.SQLOutput;

public class Counters {
    public static void main(String[] args) {
        countMethod(7);
        countMethod(14);
        int num = 227;
        countMethod(num);
        System.out.println();
        String word = "wooden spoon";
        countMethod(word.length());
        System.out.println();
        printAge(1984);


    }
    public static void countMethod(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
    }
    public static void printAge(int year){
            // birth year: 1984  Age: 38
            int age = 2021 - year;
            System.out.println("birth year: " + year + " your age: " + age );
        }
    }



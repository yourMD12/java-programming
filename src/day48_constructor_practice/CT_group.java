package day48_constructor_practice;

import java.util.Arrays;

public class CT_group {
    public static void main(String[] args) {

        Group group1 = new Group("Bugs"); //dependency injection, group object creation depends on String name
        //print size of members:
        System.out.println(group1.getMembers().size());
        group1.addMember("Mike");
        group1.addMember("Stiven");
        group1.addMember("Maria");
        System.out.println(group1.getMembers().size());

        Group group2 = new Group("mariny");
        group2.setMembers(Arrays.asList("Anastasiia","Anora","Daria"));
        //print all members, not toString()
        System.out.println("group2 members: " + group2.getMembers());

        //use if statement to check if rahib is here
        if(group2.getMembers().contains("rahib")){
            System.out.println("rahib is here");
        }else{
            System.out.println("rahib is not here");
        }

        //remove some members from group1
        group1.removeMember("Mike");
        System.out.println(group1);


    }
}

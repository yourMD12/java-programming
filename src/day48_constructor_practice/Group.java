package day48_constructor_practice;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private  String name;
    private List<String> members = new ArrayList<>();

    // constr that accepts a name
    public Group(String name){
        this.name = name;
        members = new ArrayList<>();
    }

    public void addMember(String newMember){
        members.add(newMember);
    }

    public void removeMember(String remMem){
        members.remove(remMem);
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", members=" + members +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }
}

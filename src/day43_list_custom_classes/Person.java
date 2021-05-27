package day43_list_custom_classes;
// name, age
public class Person {
    // data -> variables
    String name;
    int age;
    char gender;
    //behaviour -> method
    public void speak(){
        System.out.println("person is speaking");
    }
}

class People{ //class for running with main method
    public static void main(String[] args){
        // create object of Person class = instantiate Person class
        Person person1 = new Person();
        person1.name = "Bob";
        person1.age = 33;
        person1.gender = 'M';
        person1.speak();
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.gender);

        System.out.println();

        Person person2 = new Person();
        person2.name = "Mike";
        person2.age = 12;
        person2.gender = 'M';
        person2.speak();                                                            // person is speaking
        System.out.println(person2.name + " " + person2.age + " " + person2.gender);// Mike 12 M

    }
}

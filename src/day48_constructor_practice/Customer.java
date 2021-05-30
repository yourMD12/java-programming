package day48_constructor_practice;

public class Customer {
    private String name;
    private int id;

    //no args constr
    public Customer(){
        System.out.println("no-args constructor");
        name = "new customer";
        id = -1;
    }

    //add a constructor with params where we can assign name & id
    public Customer(String name, int id){
        System.out.println("2-args constructor");
        this.name = name; // setName(name);
        this.id = id;// setId(id); when we have some conditions in setter

    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

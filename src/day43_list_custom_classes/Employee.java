package day43_list_custom_classes;

public class Employee {
    // instance/object variables
    String name;
    String jobTitle;

    //instance/object method/behaviour
    public void work() {
        System.out.println(name + " works as " + jobTitle);
    }
}
    class Company{
        public static void main(String[] args) {

            Employee emp = new Employee();
            emp.name = "Helen S.";
            emp.jobTitle = "SDET";
            emp.work();
            //System.out.println(emp.name + " " + emp.jobTitle);

            Employee emp2 = new Employee();
            emp2.name = "John V.";
            emp2.jobTitle = "QA";
            emp2.work();
            //System.out.println(emp2.name + " " + emp2.jobTitle);

            Employee emp3 = new Employee();
            emp3.name = "Daria M.";
            emp3.jobTitle = "SM";
            emp3.work();
            //System.out.println(emp3.name + " " + emp3.jobTitle);

            emp = emp2;
            emp.work();
        }
    }




package day51_inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee dev = new Employee();
        dev.jobTitle = "java dev";
        System.out.println("dev.calculateSalary(55.0) = " + dev.calculateSalary(55.0));
        double annualDevSalary = dev.calculateSalary(62.0);
        System.out.println("annualDevSalary = " + Math.round(annualDevSalary));


        Contractor sdetContr = new Contractor();
        sdetContr.jobTitle = "SDET";
        double sdetSalary = sdetContr.calculateSalary(55.0);
        System.out.println("sdetSalary = " + sdetSalary);

        System.out.println(dev.toString());
        System.out.println(sdetContr.toString());



    }

}

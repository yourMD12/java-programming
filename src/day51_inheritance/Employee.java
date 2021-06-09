package day51_inheritance;

public class Employee extends Object {
    //String fullTime;
    // calculateSalary(double hourlyRate) method
    //returns annual salary plus 10% bonus

    //String contractor;
    // calculateSalary(double hourlyRate) method
    //returns annual hours * hourlyRate

    String jobTitle;

    public double calculateSalary(double hourlyRate){
        return 52 * 40 * hourlyRate * 1.1;
    }

    //toString method is inherited from Object class
    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}

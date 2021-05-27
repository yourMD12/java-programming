package day05_primitives_concatanation;

public class JobInformation {
    public static void main(String[]args){
        //title,company,jobDescription,salary,yearsExp,hasBenefits
        String title = "test engineer";
        String company = "Google";
        String jobDescription = "cool person";
        double salary = 1500;
        byte yearsExp = 3;
        boolean hasBenefits = true;

        System.out.print("We are looking for " +title);
        System.out.println(" in our famous company "+ company);
        System.out.println("We need very " +jobDescription);
        System.out.println("Our salary is $" +salary +" a week");
        System.out.println("Minimum experience suppose to be " + yearsExp +" years");
        System.out.println("And yes, our great benefits is " +hasBenefits);





    }
}

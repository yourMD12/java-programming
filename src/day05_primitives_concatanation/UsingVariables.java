package day05_primitives_concatanation;

public class UsingVariables {
    public static void main(String[]args){
        int num1 = 100;
        int num2 = num1;
        System.out.println(num1);
        System.out.println(num2);

        num1 = 200; //will not run 200 because after this we dont put system.out, and java works from top to bottom
        System.out.println(num1); //here will print 200
        System.out.println(num2); //here will print 100 cause we didn't change value for num2,and its still =num1(6)

        int n1 = 55;
        int n2 = n1;
        int n3 = n2;
        System.out.println(n3);


    }
}

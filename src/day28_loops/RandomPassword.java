package day28_loops;
import java.util.*;
public class RandomPassword {
    public static void main(String[] args) {

        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz_!@#$%^&*";
        //char for password = 8
        Random random = new Random();
        String password = "";
        for(int i = 1; i <=8;i++){
            System.out.println(random.nextInt(source.length()));
        }
        for(int i = 1; i <=8;i++){
            int index = random.nextInt(18);// random num 0-70
            System.out.print(source.charAt(index));
            //source.substring(index,index +1) FOR ONE CHAR ONLY
            //add the char to password variable using +=
            //password = password + source.CharAt(index);
            password += source.charAt(index);
        }
        System.out.println();
        System.out.println(" your password is " + password);


    }
}

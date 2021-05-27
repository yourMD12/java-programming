package day14_multi_branch_if_statements;
import java.util.Scanner;
public class ChooseLanguages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int selection = scan.nextInt();
        //"hello, thank u for our call"
        //int s2 = 2;
        //"hola, gracias para llamar"
        //int s3 = 3;
        //"merhaba, aradiginiz icin tesekkurler"
        //int s4 = 4;
        //"privet,spasibo za zvonok"
       // int s5 = 5;
        //"merci, pour votre appel"
        //NOTHING "lets talk Java"
        if(selection == 1){
            System.out.println("hello, thank u for our call");
        }else if(selection == 2){
            System.out.println("hola, gracias para llamar");
        }else if(selection == 3){
            System.out.println("merhaba, aradiginiz icin tesekkurler");
        }else if(selection == 4){
            System.out.println("privet,spasibo za zvonok");
        }else if(selection == 5){
            System.out.println("merci, pour votre appel");
        }else{
            System.out.println("lets talk Java");
        }

    }
}

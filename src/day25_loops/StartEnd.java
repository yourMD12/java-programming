package day25_loops;
import java.util.Scanner;
public class StartEnd {
    public static void main( String [] args){
        //print all num from start till end separated by space
        //s = 3, e=6 : 3 4 5 6
        //if start>end = "reverse numbering is not support"
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your numbers:");
        int start = scan.nextInt();
        int end = scan.nextInt();
        for(int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
            if(start > end){
                System.out.println("reverse numbering is not support");
            }


    }
}

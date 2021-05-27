package day27_loops;

public class Neighbors {
    public static void main(String[] args) {

        String word = "jaavvaa spoonn";

        //if 2 side by side char match- signal beep -> print a match(aa,vv..)
        for(int index = 0; index < word.length()-1; index++ ){
            System.out.print(word.charAt(index));
            System.out.println(word.charAt(index+1));
            if(word.charAt(index) == word.charAt(index +1)){
                System.out.println("beep - " + word.charAt(index));
            }
        }
    }
}

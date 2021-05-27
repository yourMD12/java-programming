package day27_loops;

public class indexOf {
    public static void main(String[] args) {

        String word = "github";
        char letter = 'b';
        int index = -1;
        //loop+if: if charAt(i) ==letter -> store the i value into index, sout " i is found at index 1"
        for(int n = 0; n < word.length(); n++){
          //  System.out.println(n + "-" + word.charAt(n));
            if(word.charAt(n) == letter){
                index = n;
                System.out.println(letter + " is found at index " + index);
                break;//exit for loop
                // return //exit whole code

            }
        }
        if(index == -1) {
            System.out.println(letter + " is not present");
        }else{
            System.out.println(letter + " is found at index " + index);
        }
    }
}

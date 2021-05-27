package day26_loops;

public class CountMatches {
    public static void main(String[] args) {
        String w = "lidiya";
        char letter = 'b';
        int count = 0;
        //for loop read each character, and test if it matches letter; if true- add 1 to count
        for(int i = 0; i <w.length();i++) {
            if(w.charAt(i) == letter){
                count++;
            }
        }
        System.out.println("there are " + count + " " + letter + "'s in " + w);

    }
}

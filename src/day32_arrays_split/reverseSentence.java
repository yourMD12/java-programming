package day32_arrays_split;

public class reverseSentence {
    public static void main(String[] args) {

        String sentence = "today is java";
        String[] words = sentence.split(" ");
        String reverse = "";
        //print words array in reverse order
        for(int i= words.length-1; i >=0; i--){
            //System.out.println(words[i] + " ");
            reverse += words[i] + " ";
        }
        System.out.println("sentence " + sentence);
        System.out.println(" reversed " + reverse.trim()); //reversed java is today



    }
}

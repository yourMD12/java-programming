package day32_arrays_split;

public class SentenseSplit {
    public static void main(String[] args) {

        String s = "java is fun";
        String[] words = s.split(" ");
        System.out.println("1st word " + words[0]);
        System.out.println("2nd word " + words[1]);
        System.out.println("3rd word " + words[2]);
        //System.out.println("4th word " + words[3]); OUT OF BOUNDS
        for(String w : words){
            System.out.println(w);
        }

        String google = "About 1,810,000 results (0.68 seconds)";
        String[] results = google.split(" ");
        System.out.println("count " + results[1]); //count 1,810,000
        System.out.println("seconds " + results[3].replace( "(", "")); // seconds 0.68
        System.out.println("seconds " + results[3].substring(1)); // seconds 0.68
        

    }
}

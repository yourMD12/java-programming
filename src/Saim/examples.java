package Saim;

public class examples {
    public static void main(String[] args) {

        String str = "java";
        char letter = 'a';
        int count =0;

        for(int i =0; i< str.length(); i++){
            if(str.charAt(i) == letter){
                count++;
            }
        }
        System.out.println(letter + " was fount " + count + " times");

    }
}

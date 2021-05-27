package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        
        
        //char array with values:
        // java is fun = j a v a ' ' i s ' ' f u n 
        
        char[] charArray =  {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n' };
        //print each letter using a loop
        for(char letter : charArray){
            System.out.print(letter + " ");
        }
        String sentence = new String(charArray);
        System.out.println("\nsentence " + sentence );
        System.out.println();
        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("itemArray.length= " + itemArray.length );
        System.out.println("item.length() " + item.length());
        System.out.println();
        String[] fruits = {"bananas", "apples", "kiwi", "mango", "papaya", "strwbrry"};
        String fruitStr = "";
        for(String each : fruits){
            System.out.print(each+ "-" );
            fruitStr += each + "-";
        }
        System.out.println("\nfruitStr: " + fruitStr);
        System.out.println();
        String[] languages = {"java", "python", "c++", "sql","ruby","javaScript"};
        System.out.println(String.join("###",languages));
        String joinedLanguages = String.join("<>", languages);
        System.out.println("joinedLanguages = " + joinedLanguages);



                 
        
    }
}

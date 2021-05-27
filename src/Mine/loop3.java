package Mine;

public class loop3 {
    public static void main(String[] args) {

//1
         String book = "Chapter 1 datatypes and variables. Chapter 2 conditional statements. chapter 3 String manipulation." +
                 " Chapter 4 Loops. Chapter 5 Arrays. Chapter 6 Methods. chapter 7 ArrayList. chapter 8 instance and static." +
                 " Chapter 9 Constructors. Chapter 10 Encapsulation and Inheritance. Chapter 11 Abstraction and Polymorphism. " +
                 "Chapter 12 Exceptions. Chapter 13 Collections. Chapter 14 Learn more.";
         int count =0;
         book = book.toLowerCase();
         while(book.contains("chapter")){
             book = book.replaceFirst("chapter", "");
             count++;
             }
         System.out.println( " total: " + count * 10 + "$");
//2
        System.out.println();
        String w = "i love java";
        String reverse = "";
        String second = w.substring(w.indexOf(" ")+1, w.lastIndexOf(" "));
        for(int i =second.length()-1; i>0; i--){
            reverse += second.charAt(i);
        }
        System.out.println(w.replace(second,reverse)); // i evol java
//3
        System.out.println();
         String w1= "thisHasManyWordsToFind";
         int count1 =1;
         for(int i =0;i< w1.length(); i++){
             if(w1.charAt(i) >= 'A' && w1.charAt(i) <= 'Z'){
                 count1++;
             }
         }
        System.out.println("here " + count1 + " words");
//4
        System.out.println();
        int num = 50;
        int count2 =0;
        for(int i = 2;i <= num; i++){
            count2 =0;
            for(int j =2;j <i; j++){
                if(i % j ==0){
                    count2++;
                }
            }
            if(count2 == 0){
                System.out.print(i + " ");
            }
        }
//5
        System.out.println();
        String ch = "AAABCCDEEF";







        //[IQ] Unique characters
        // Given a String, find and print the unique characters.
        // A character is unique if it only appears once in the String. Ex:AAABCCDEEFOutput:BDF

        //[IQ] Duplicate characters
        // Given a String, find and print the duplicate characters. A character is duplicate if it appears more than once in the String. Ex:AAABCCDEEFOutput:ACE



    }
}

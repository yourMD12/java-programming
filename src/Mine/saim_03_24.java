package Mine;

public class saim_03_24 {
    public static void main(String[] args) {
//1 ??????????????????????????????????????????????
        String w1 = "apple";
        String w2 = "banana";
        System.out.print(w1.substring(1));//pple
        System.out.println(w2.substring(0,w2.length()-1));//banan
        //System.out.println(w2.substring(0,5));
//2
        String txt = "elephant";
        int middle = txt.length()/2;
        if(txt.length() % 2 == 0){
            System.out.println("even word: " +txt.substring(middle -1, middle +1));
        }else{
            System.out.println("odd word: " + txt.substring(middle, middle+1));
        }

//3
        String name = "james bond";
        System.out.println("your initials are: " + name.toUpperCase().charAt(0)+ name.toUpperCase().substring(name.indexOf(" ")+1,name.indexOf(" ")+2));

//4
        String sentence = "Java is fun";
        int indexOfFirstSpace = sentence.indexOf(' ');
        System.out.println(sentence.substring(indexOfFirstSpace +1) + " " + sentence.substring(0,indexOfFirstSpace));

//5
        String message = "Sender: <James Bond>. From Number: [202-123-3456]. +Message: {“I love programming and problem solving}";
        String sender = message.substring(message.indexOf("<")+1,message.indexOf(">"));
        System.out.println("sender = " + sender);
        String num = message.substring(message.indexOf("[")+1, message.indexOf("]"));
        System.out.println("num = " + num);
        String mes = message.substring(message.indexOf("{")+1, message.indexOf("}"));
        System.out.println("mes = " + mes);

//6
        System.out.println("enter your first and second word:");
        String word1 = "jamesa";
        String word2 = "bondiu";
        if(word1.length() < 6 && word2.length() <6 ){
            System.out.println("invalid data");
        }else{
            String first = word1.substring(0,4);
            int index = word2.length() -3;
            String second = word2.substring(index);
            System.out.println(first + second + "@cybertek.com");
        }

    }
}

package day38_methods;

public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if(StringUtils.isNullOrEmpty(userName)){
            System.out.println("FAIL: userName can't be null or empty"); //FAIL: userName can't be null or empty
        }
        System.out.println();
        System.out.println("isPalinrome(civic) = " + StringUtils.isPalindrome("civic"));
        System.out.println("isPalindrome(kayak) = " + StringUtils.isPalindrome("kayak"));
        System.out.println("isPalindrome(Cybertek) = " + StringUtils.isPalindrome("Cybertek"));


        String word = "hello";
        String revWord = StringUtils.reverse(word);
        System.out.println("word = " + word); // hello
        System.out.println("revWord = " + revWord); // olleh


    }

}

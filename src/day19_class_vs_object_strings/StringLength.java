package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String [] args){
        String word = "meow";
        System.out.println(word.length()); //4
        System.out.println("count " + word.length());
        System.out.println("wooden spoon".length()); //12
        String name = "vasya"; //" vasya " -> 7 cause of spaces
        System.out.println("name " + name.length()); //5
        int count = name.length();
        System.out.println("count = " + count);

        String password = "Abc123";
        /**IF STATEMENT:
         * WHEN password is at least 6 characters:
         * print :valid amazon password"
         *ELSE
         * "password too short"
         */
        if(password.length() >= 6){
            System.out.println("valid amazon password");
        }else{
            System.out.println("password too short");
        }


    }
}

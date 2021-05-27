package Mine;

public class saim_03_22 {
    public static void main(String[] args) {
 //1
        String all = "james bond";
        String lastName = "bond";
        if(all.contains(lastName)){
            System.out.println("same last name");
        }else{
            System.out.println("not the same last name");
        }
//2
        String message = "hello idiot";
        if(message.contains("idiot") || message.contains("dumb") || message.contains("heck")){
            System.out.println("message not sent");
        }else{
            System.out.println("message sent");
        }
//3
        String adress = "ocean pwy 25478";
        if(adress.length()== 0){
            System.out.println("no adress found");
        }else{
            System.out.println(adress.toUpperCase());
        }
//4
        /** ???????????????????????????????????????????????????????????????????????????????????????????????

        String name = "vasya";
        String code = "11235vasya";
        if(code.length() < 5){
            System.out.println("Password cannot be less than 5 characters");
            if(code.contains(name)){
                System.out.println("Invalid password, username should not be in it");
            }else if(code.length() >= 5){
                System.out.println("Valid password");
                System.out.println(code.replace(code, "password"));
            }
        }
        */
//5
        String w1 = "hallo";
        String w2 = "hakijgh";
        String w3 = "baejutyrtdsfh";
        String var = "h";
        if(w1.contains(var) && w2.contains(var) && w3.contains(var)) {
            if (w1.length() > w2.length() && w1.length() > w3.length()) {
                System.out.println(w1);
            } else if (w2.length() > w1.length() && w2.length() > w3.length()) {
                System.out.println(w2);
            } else {
                System.out.println(w3);
            }
        }
//6
        String text = "java class is fun";
        int num = 2;
        if(num == 1){
            System.out.println(text.replace("a","e"));
        }else if(num ==2){
            System.out.println(text.replace("s","r"));
        }else if(num ==3){
            System.out.println(text.replace("o","z"));
        }

    }
}

//Given a username and password verify they are valid.
//    - The password cannot be less than 5 characters
//        -> If it is less print: "Password cannot be less than 5 characters"
//        -> If it is more then or equal to 5 print: "Valid password"
//
//    - Also the password should not contain the username
//        - If the password has the username in it print:
//            "Invalid password, username should not be in it"
//            -> Also change the password to have the value: "password"

package Mine;

public class Saim_03_21 {
    public static void main(String[] args) {
 //1
        String name = "azamat";
        if(name.startsWith("a") || name.startsWith("z")){
            System.out.println("your name is cool");
        }else if(name.startsWith("m")){
            System.out.println("almost cool");
        }else{
            System.out.println("sorry,nor a cool name");
        }
//2
        System.out.println();
        String num = "485960584";
        if(num.startsWith("2")) {
            if (num.length() == 7) {
                System.out.println("Valid 7 digit account number");
            } else {
                System.out.println("Invalid 7 digit account number");
            }
            if (num.startsWith("5")) {
                if (num.length() == 10) {
                    System.out.println("Valid 10 digit account number");
                } else {
                    System.out.println("Invalid 10 digit account number");
                }
            }
        }else{
            System.out.println("Invalid account number");
        }

    }
}

//Declare a variable account number (String). You will check if these account numbers are valid.
//    - If the account number begins with a “2” the account number should be 7 characters long
//        -> Print: "Valid 7 digit account number"
//            Otherwise: "Invalid 7 digit account number"
//    - If the account number begins with a “5” the account number should be 10 characters long
//        -> Print: "Valid 5 digit account number"
//            Otherwise: "Invalid 5 digit account number"
//    — If the account number does not begin with a 2 or a 5
//        -> Print "Invalid account number"
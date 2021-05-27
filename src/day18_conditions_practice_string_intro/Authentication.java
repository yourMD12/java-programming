package day18_conditions_practice_string_intro;

public class Authentication {
    public static void main(String[] args) {
        //last4SSN, pinCode, expLast4SSn, expPinCode . If they are matched its fine if no- try one more time
        int last4SSN = 9876;
        int pinCode = 1234;
        int expLast4SSN = 9876;
        int expPinCode = 1634;
        if(last4SSN == expLast4SSN && pinCode == expPinCode) {
                System.out.println("Welcome to the system!");
            }else if(last4SSN != expLast4SSN){
            System.out.println("last 4 numbers of SSN doesn't match");
            }
        if(pinCode != expPinCode){
            System.out.println("your pinCode doesn't match");
        }
    }
}
//   int last4ssn = 2255;
//        int expPinCode = 2589;
//
//        if (last4ssn == 2555){
//            System.out.println("enter pincod");
//        }else if (expPinCode == 2689){
//            System.out.println("access granted");
//        }else {
//            System.out.println("wrong " + expPinCode + " please try again");
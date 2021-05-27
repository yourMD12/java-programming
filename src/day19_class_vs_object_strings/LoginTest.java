package day19_class_vs_object_strings;

public class LoginTest {
    public static void main(String [] args){
        String expUserName = "cybertek";
        String expPass = "Abc123";
     //userName is not case sensitive, but password is
        String UserName = "CYBERTEK";
        String Pass = "Abc123";
        //expU == UN && expP ==p : "user sauccessfully logged in"
        //else expUN !=UN : "incorrect Username"
        //else "Incorrect password"
        if(expUserName.equalsIgnoreCase(UserName) && expPass.equals(Pass)) {
            System.out.println("user successfully logged in");
        }else {
            if(!expUserName.equalsIgnoreCase(UserName)){
                System.out.println("incorrect Username");
            }else{
                System.out.println("Incorrect password");
            }
        }
    }
}

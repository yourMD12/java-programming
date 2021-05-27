package day37_methods_overloading;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("cybertek","abc123"); // positive test/ sunny day
        loginVoid("cybertek", "fgrjs"); // negative test, rainy day scenario
        loginVoid("", ""); // incorrect
        //System.out.println(loginVoid("cybertek", "abc123")); ERROR
        System.out.println();

        System.out.println(login("cybertek", "abc123"));
        if(login("cybertek", "123abc")) {
            System.out.println("login successful");
            System.out.println("select course to continue");
        }else{
            System.out.println("login failed");
        }
        System.out.println();

        boolean isLoginSucess = login("nadir", "mountain");
        System.out.println("is login success: " + isLoginSucess);
        if(login("nadir", "mountain")){
            System.out.println("welcome to canvas");
        }else{
            System.out.println("something wrong with your credentials");
        }
        //String ret = System.out.println("hello"); ERROR, its void



    }
    public static void loginVoid(String userName, String password){
        String secretName = "cybertek";
        String secretPassword = "abc123";
        if(userName.equalsIgnoreCase(secretName) && password.equals(secretPassword)){
            System.out.println("login successful, welcom student!");
        }else{
            System.out.println("incorrect username or password");
        }
    }
    public static boolean login(String userName, String password){
        String secretUN = "kva";
        String secretPassw = "123abc";
        // return userName.equalsIgnoreCase(secretUN) && password.equals(secretPassw);
        if(userName.equalsIgnoreCase(secretUN) && password.equals(secretPassw)){
            return true; // return true and exit method here; return false will not run
        }
        return false;
    }
}

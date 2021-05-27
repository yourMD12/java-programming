package day13_conditional_statesmets;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        //boolean isHungry, check isHungry, true: Im hungry I'll go get smthng to eat. Then code java
        //false: Im not hungry,lets keep coding Java
        boolean isHungry = true;
        if(isHungry == true){ //if(isHungry){}
            System.out.println("I'm hungry, I'll go get something to eat.\nThen code Java");
        }else{
            System.out.println("I'm not hungry,let's keep coding Java");
        }
        System.out.println();
        double price = 130.44;
        // budjet = 200;
        boolean isAffordable = price <= 200.0;
        System.out.println("is affordable " + isAffordable);
        if(isAffordable){
            System.out.println("I can afford it, lets buy!");
        }else{
            System.out.println("too expensive,lets keep coding java");
        }
        System.out.println();
        boolean isRemoteJob = true;
        //if its NOT remote job--Sorry,Im nor interested
        //if its remote job--Sure Im interested,what is the interview process?
        if (!isRemoteJob) {     //(isRemoteJob != true) OR (isRemoteJob == false) {
            System.out.println("Sorry,Im not interested");
        }else{
            System.out.println("Sure Im interested,what is the interview process?");
        }

    }
}

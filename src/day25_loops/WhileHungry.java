package day25_loops;

public class WhileHungry {
    public static void main(String[] args) {
        boolean isHungry = true;
        int banana =3 ;
        //int countToFull ==3;
        //1) while(isHungry && banana != countToFull)
        while(isHungry){
            banana ++;
            if(banana == 3){
                isHungry = false;
                //OR 2) banana++;
                //System.out.println(banana);
                //isHungry = banana ==countToFull? false:true;
            }
        }
        System.out.println("i ate " + banana + " bananas");



    }
}

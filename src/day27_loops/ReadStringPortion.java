package day27_loops;

public class ReadStringPortion {
    public static void main ( String [] args){

        String list = "cat,car,cat,red_car,java,selenium ";
        //using substring print 1st 3 letters
//        System.out.println(list.substring(0, 3)); // cat
//        System.out.println(list.substring(1,4)); //at,
        //int i = 0; sout(list.substring(i,i+3); i++; sout(list.substring(i, i+3); i++;...
        
        for(int i = 0; i < list.length()-2; i++) {
            System.out.println(list.substring(i, i + 3));
        }
        System.out.println();
        String list2 = "cat,car,black cat, red car";
        //if list2.substring(i, i+3) == "cat"/"car' -> cat/car found
        for(int i = 0; i < list2.length()-2; i++) {
            System.out.println(list2.substring(i, i + 3));
            if (list2.substring(i, i + 3).equals("cat") || list2.substring(i, i + 3).equals("car")) {
                System.out.println("cat/ car found");
            }
        }
        System.out.println();
        for(int i = 0; i < list2.length()-2; i++) {
            String part = list2.substring(i,i+3);
            System.out.println("part = " + part);
            if (part.equals("cat") || part.equals("car")) {
                System.out.println("cat/ car found");
            }
        }


    }
}

package day39_wrapper_classes;

public class WrapperClasses {
    public static void main(String[] args) {

        int num = 100;
        System.out.println("num = " + num);
        num +=10;
        System.out.println(num); // 110

        Integer n = new Integer(500);
        System.out.println("is n 500? " + n.equals(500)); // true
        System.out.println(n + 300); // 800

        Integer intObject = 1000;
        System.out.println(intObject / 50); // 20
        //convert intObject to string
        String nusStr = intObject + "";
        System.out.println(nusStr); // 1000
        String numSt = intObject.toString();
        System.out.println(numSt); //1000


        /**
         * DECLARING & INITIALIZATION WRAPPER CLASSES:
         */

        Byte b1 = new Byte((byte)5);
        Byte b2 =10;
        Short sh1 = new Short((short)40);
        Short sh2 = 50;
        Integer i1 = new Integer(100);
        Integer i2 = 200;
        Long l1 = new Long(300L);
        long l2 = 3455L;
        Float fl1 = new Float(5.2F);
        Float fl2 = 45.3F;
        Double d1 = new Double(345.3);
        Double d2 = 234.5;
        Character ch1 = new Character('q');
        Character ch2 = 'V';
        Boolean bl1 = new Boolean(true);
        Boolean bl2 = false;




    }
}

package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {

        //firstN(1), lastN(2), batchNum(3), phoneNum(4), id(0)
        // declare student array & store 5 string values

        //LONG WAY
        String [] student1 = new String[5];
        student1 [0] = "ms15";
        student1 [1] = "masha";
        student1 [2] = "smith";
        student1 [3] = "15";
        student1 [4] = "9436548874";

        //SHORT WAY
        String[] student2 = {"mk4421", "mike", "bloomer", "b22", "46583946234"};
        System.out.println("student1 id: " + student1[0]);
        System.out.println("name: " + student1[1] + " " + student1[2] );
        System.out.println(" batch: " + student1[3]);
        System.out.println("phone: " + student1[4]);

        System.out.println("student data length: " + student1.length);

        // 1) check if st1 data array contains 5 items; T -> correct length, F -> not correct length
        // 2) check if st1 and st2 have same num of data
        if(student1.length == 5){
            System.out.println("correct length");
        }else{
            System.out.println("not correct length");
        }
        System.out.println();
        if(student1.length == student2.length){
            System.out.println("matched");
        }else{
            System.out.println("not matched");
        }
        //print firstN and lastN Upppercase
        System.out.println(student1[1] + " " + student1[2].toUpperCase());

        //read mobile from array and store into variable:
        String mobileNum = student1[4];
        System.out.println(mobileNum.length());
        System.out.println(mobileNum.startsWith("202"));






    }
}

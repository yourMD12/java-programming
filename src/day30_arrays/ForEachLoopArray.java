package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        // indexes:   0    1   2    3   4    5
        int[] data = { 32, 532, 1, 5454, 22, 123, 543, 999, 321, 3 };
        for(int eachNum : data){
           // System.out.print(eachNum);
            System.out.print(eachNum + " ");
        }
        System.out.println();
        //repeat above with for loop
        for(int i =0; i < data.length; i++){
            System.out.println(data[i]);
        }
        //print last values in index using length -1
        System.out.println("last value: " + data[data.length-1]);//length =10, index= 9
        //print all num backward in the same line
        for(int idx = data.length-1; idx >= 0; idx--){
            System.out.println(data[idx] + " ");
        }





    }
}

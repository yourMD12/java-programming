package day32_arrays_split;

public class CountUsingSplit {
    public static void main(String[] args) {

        String catTypes = "bengal cat tabby cat persian cat no cat here some other cat type";
        String [] catArray = catTypes.split("cat");
        System.out.println("number of 'cat' = " +(catArray.length-1)); //number of cat =5
        for(String type : catArray){
            System.out.println(type); // each word in new line without CAT
        }
        // OR

        int count =0;
        for(int i =0; i < catTypes.length() -2; i++){
            if(catTypes.substring(i,i+3).equals("cat")){
                count++;
            }
        }
        System.out.println("count of cats " + count); //count of cats 5

    }
}

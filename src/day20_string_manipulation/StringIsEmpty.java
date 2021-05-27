package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String [] args){
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty()); //True
        System.out.println(jobTitle.length()); //0
        System.out.println(jobTitle.length() == 0); //true

        if(jobTitle.isEmpty()){
            System.out.println("jobTitle is missing, please resend");
        }else{
            System.out.println("jobTitle looks good");
        }

        if(jobTitle.length() == 0){
            System.out.println("job title is empty");
        }else{
            System.out.println("job title is not empty");
        }
        System.out.println(jobTitle.equals("")); //true

        if("".equals(jobTitle)){
            System.out.println("job title is empty");
        }else{
            System.out.println("job title not empty");
        }
        String word = " ";
        System.out.println(word.isEmpty()); //false
        System.out.println(word.length()); //1

        String veggie = "carrots";
        System.out.println(veggie.isEmpty()); //false
        // if veggie IS NOT EMPTY, print We have carrots
        if(!veggie.isEmpty()){ //(veggie.isEmpty() == false)
            System.out.println("we have " + veggie);
        }

        String word2;
        //System.out.println(word2.isEmpty()); ERROR, NOT INITIALIZED



    }
}

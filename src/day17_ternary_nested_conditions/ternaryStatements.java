package day17_ternary_nested_conditions;

public class ternaryStatements {
    public static void main(String[] args) {
        int score1 = 75;
        String result1;
        if(score1> 60){
            result1 = "Pass";
        }else{
            result1 = "Fail";
        }
        System.out.println("result1 = " + result1);
        //with ternary:
        int score = 88;
        String result = (score > 60) ? "Pass" : "Fail";
        System.out.println("result is " + result);
        System.out.println();
        String quality = "good";
        int rating = quality.equals("good") ? 100 : 0;
        System.out.println(quality.equals("good")? 100 : 0);
        System.out.println("rating " + rating);

      //  int score3 = 100;
     //   char grade = 'A';
     // if (score > 90){
      //     grade = 'A';
     // }else{
      //     grade = 'B';
      //  }
      //  char grade = (score3 > 90) ? 'A' : 'B';






    }
}

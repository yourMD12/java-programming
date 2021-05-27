package day24_loops;

public class YouTubeCatVideo {
    public static void main (String [] args) throws InterruptedException {
        //0-1.57  "watching Youtube video: second: 1 ; "finished watching CatVideo,lets start another one
/**        int sec = 0;
        System.out.println("let's watch Cat Video");
        while(sec <= 117){
            System.out.println("watching Youtube video: second: " +sec);
            sec++;
            Thread.sleep(1000);
        }
        System.out.println("finished watching CatVideo,lets start another one");

        System.out.println();

        int count = 5;
      //  count = 5;
     //   count = 4;
     //   ....
     //   count = 0; finished the count
        while(count >= 0){
            System.out.println("count:" + count);
            count--;
        }
        System.out.println();
*/
        int unSms = 10;
        System.out.println("i have total " +unSms + " unread sms");
        while(unSms > 0) {
            System.out.println("reading sms: " + unSms);
            --unSms;
        }
        System.out.println("no more unread sms");



    }
}

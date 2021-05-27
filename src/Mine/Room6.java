package Mine;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Room6 {
    //write a method to switch player
    public static void main(String[] args) {

        System.out.println(change('x'));


    }

    public static char change(char player){
        if(player == 'x'){
            player = 'o';
        }else{
            player = 'x';
        }
        return player;
//        String player = "o";
//        //String player2;
//        //String choose = "";
//        int count = 0;
//        //box max 9 num
//        for(int i =0; i<=9; i++){
//            if(player.equalsIgnoreCase("x")){
//                System.out.println(player);
//                count++;
//                player ="o";
//            }
//            if(player.equalsIgnoreCase("o")) {
//                System.out.println(player);
//                count++;
//                player = "x";
//            }
//        }
    }

}

package day16_switch_ternary;

public class Elevator {
    public static void main(String[] args) {
        int floorNum =3;
        //fln = 1 -> "floor 1 selected. Companies: Lobby, verizon, starbucks
        //fln = 2 -> cybertek, nasa, Intelsat
        //fln 3 = 3 -> lyft, bofa, stake house
        // else -> invalid floor - fln
        if(floorNum == 1){
            System.out.println("floor 1 selected. Companies: Lobby, Verizon, Starbucks");
        }else if(floorNum ==2){
            System.out.println("floor 2 selected. Companies: Cybertek, NASA, Intelsat");
        }else if(floorNum ==3) {
            System.out.println("floor 2 selected. Companies: Lyft, Bofa, Stake house");
        }else{
            System.out.println("Invalid floor - " + floorNum);
        }
        System.out.println();
        switch(floorNum){
            case 1 :
                System.out.println("floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                break;
            case 2 :
                System.out.println("floor 2 selected. Companies: Cybertek, NASA, Intelsat");
                break;
            case 3 :
                System.out.println("floor 2 selected. Companies: Lyft, Bofa, Stake house");
                break;
            default :
                System.out.println("Invalid floor - " + floorNum);
                break;
        }

    }
}

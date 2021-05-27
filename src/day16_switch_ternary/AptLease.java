package day16_switch_ternary;

public class AptLease {
    public static void main(String[] args) {
        //numBed= 0,1,2, price = 0.0
        //if bed = 0, studio apt selected.started price =1454
        //if bed = 1, 1br apt selected.started price =1725
        //if bed = 2, 2br apt selected.started price =2899
        //sout: starting price $...
        int numBr = 1;
        double price = 0.0;
        System.out.println("WELCOME TO ADAIRE APARTMENTS!");
        switch (numBr){
        case 0:
            price = 1454;
            System.out.println("Studio apartment selected.Started price = $" + price);
            break;
            case 1:
                price = 1725;
                System.out.println("1 Bedroom apartment selected.Started price = $" + price);
                break;
            case 2:
                price = 2899;
                System.out.println("2 Bedroom apartment selected.Started price = $" + price);
                break;
            default:
                System.out.println("5 Bedroom currently unavailable");
        }
        System.out.println("Starting price for your apartment is: $" + price);

    }
}

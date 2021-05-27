package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main (String[]args){
        //car,model,driverName,lisenceNumber,speed,automatic,licenceClass
        String car = "opel";
        String model = "veneer";
        String driverName = "Daria M";
        String licenceNumber = "DHYFRY7";
        Short speed = 200;
        boolean isAutomatic = true;
        char licenceClass = 'B';
        System.out.println("car " +car);
        System.out.println("model "+model);
        System.out.println("driverName "+ driverName);
        System.out.println("licenceNumber "+ licenceNumber);
        System.out.println("speed " +speed);
        System.out.println("it is automatic "+isAutomatic);
        System.out.println("speed " +speed +" miles per hour");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        //   house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?,
        //   is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode,
        //   is a park near by, Rating of surrounding school districts (out of 5)
        String houseType = "private";
        short numberOfBedrooms = 4;
        short numberOfBathrooms = 3;
        short numberOfKitchens = 2;
        boolean isBasement = true;
        boolean isAttic = true;
        boolean isPool = false;
        boolean isForSale = false;
        int costHouse = 500000;
        String address = "2349 vienna street";
        int zipcode = 375987;
        boolean isParkIsHere = true;
        char ratingOfSchool = '4';
        System.out.println("House type: " + houseType);
        System.out.println("# of bedrooms: " + numberOfBedrooms);
        System.out.println("# of bathrooms: " + numberOfBathrooms);
        System.out.println("# of kitchen: " + numberOfKitchens);
        System.out.println("this house has basement: " + isBasement);
        System.out.println("this house has attic: " + isAttic);
        System.out.println("this house has pool: " + isPool);
        System.out.println("this house is for sale: " + isForSale);
        System.out.println("the cost of this house: $" +costHouse);
        System.out.println("address:" + address);
        System.out.println("zipcode:" + zipcode);
        System.out.println("parking is available here: " + isParkIsHere);
        System.out.println("rating of school:" + ratingOfSchool + " from 5 " );


    }
}

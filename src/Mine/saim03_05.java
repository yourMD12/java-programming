package Mine;
import java.util.Scanner;
public class saim03_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

 ///1       //    - Declare two int variables: age and age in days
        //    - Use a base of 365 days in a year
        //    - Calculate and display:
        //        You are $age years old! That means you are $days days old
            int age = 28;
            int ageInDays = 28 * 365;
            System.out.println("You are " + age + " years old! That means you are " + ageInDays + " days old");
        System.out.println();

//2
        System.out.println("enter num1");
        int n1 = scan.nextInt();
        System.out.println("enter num2");
        int n2 = scan.nextInt();
        System.out.println("what do u want");
        String whatDoUWant = scan.next();
        if(whatDoUWant.equals("+")){
            System.out.println("result : " + (n1 + n2));
        }else if(whatDoUWant.equals("-")){
            System.out.println("result : " + (n1 - n2));
        }else if(whatDoUWant.equals("*")){
            System.out.println("result : " + (n1 * n2));
        }else if(whatDoUWant.equals("/")) {
            System.out.println("result : " + (n1 / n2));
        }

//3
        // // byte -> short -> int -> long -> float -> double
        //            by default whole numbers will be read as int datatype
        //            by default decimal numbers will be read as double datatype
        byte b = 10;
        short s = b;
        byte b2 = (byte)s;
        System.out.println(s); //10
        System.out.println(b2); //10
        System.out.println();
        double d = 5.3;
        int i = (short)d; // int = [(short)double] -> int = short 5
        int i2 = (int)d; //5.0
        System.out.println(i);
        System.out.println((double)i);
        System.out.println();
        float f = 3.54f; //3.54
        float f2 = (float)3.54; // float = double 3.54
        float f3 = 5; //float = int ->5.0
        float f4 = 5.5f; //float = double 5.5
        System.out.println(f);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println();
        long l = 22313;
        long l2 = 6436322328287337L;
        //long l3 = (long)6436322328287337; doesn't work cause its too big for int, next get to cast
        System.out.println(l); //22313
        System.out.println((double)l); //22313.0
        System.out.println((float)l); //22313.0
        System.out.println(l2); //6436322328287337
        System.out.println();
        double million = 1_000_000;
        System.out.println(million);

 //4
        //- Create variables with most appropriate datatypes:
        //- brand, processor, ram memory, storage memory, has monitor, has wifi car
        // , description, price, cpu, color, number of monitors, number of usb slots, has usb 3.0
        //     - Print out all the variables and values of the computer

        String brand = "msi";
        int processor = 5475757;
        int ramMemory = 512;
        int storageMemory = 320;
        boolean hasMonitor = true;
        boolean hasWifi = true;
        String description = "very cool computer";
        double price = 2500.50;
        int cpu = 6743;
        String color = "white";
        byte numberOfMonitors = 2;
        byte numberOfUsbSlots = 4;
        boolean hasUsb3 = false;

        System.out.println("brand: " +brand);
        System.out.println("processor: " + processor);
        System.out.println("ramMemory: " + ramMemory);
        System.out.println("storage memory: " + storageMemory);
        System.out.println("has monitor: " + hasMonitor);
        System.out.println("has WiFi: " + hasWifi);
        System.out.println("description: " + description);
        System.out.println("price: " + price);
        System.out.println("cpu: " + cpu);
        System.out.println("color: " + color);
        System.out.println("number of monitors: " + numberOfMonitors);
        System.out.println("number of usb slots: " + numberOfUsbSlots);
        System.out.println("has Usb: " + hasUsb3);

//5
        String houseType = "condo";
        byte numberOfBedrooms = 2;
        byte numberOfBath = 2;
        byte numberOfKitchen = 1;
        boolean isThereABasement = true;
        boolean isThereAnAttic = false;
        boolean isThereAPool = true;
        boolean isHouseForSale = false;
        int houseCost = 5093744;
        String address = "2635 Felton street";
        int zipcode = 123546;
        boolean isParkNear = true;
        byte ratingOfSchool = 4;
        System.out.println("=====HOUSE INFO======");
        System.out.println("Type of the house: " + houseType);
        System.out.println("Number of bedrooms: " + numberOfBedrooms);
        System.out.println("Number of bathrooms: " + numberOfBath);
        System.out.println("Number of kitchen: " + numberOfKitchen);
        System.out.println("There is a basement: " + isThereABasement);
        System.out.println("There is an attic: " + isThereAnAttic);
        System.out.println("There is a pool: " + isThereAPool);
        System.out.println("This house is for sale: " + isHouseForSale);
        System.out.println("Cost of this house: $" + houseCost);
        System.out.println("Address: " + address);
        System.out.println("Zipcode: " + zipcode);
        System.out.println("There is a parking slots: " + isParkNear);
        System.out.println("Rating of surrounding school districts: " + ratingOfSchool + " out of 5");

//6
        String name = "Leon";
        String genre = "about love";
        double duration = 2.07;
        String releaseDate = "March 21st 2000";
        char rating = 'G';
        boolean hasSequels = false;
        int rottenTomatoRating = 98;
        boolean isOnDvd = true;

        System.out.println("---------Welcome to the Cinema----------");
        System.out.println("Tonight we are streaming " +name + " which was released on " + releaseDate);
        System.out.println("This " + genre + " movie got a " +rottenTomatoRating + " rating on Rotten Tomatoes.");
        System.out.println("The rating is " +rating + " and it runs for " + duration + " hours.");
        System.out.println("This is a sequel " + hasSequels + " and is on DVD " + isOnDvd);

 //7
        System.out.println("Enter movie's duration:");
        double duration1 = scan.nextDouble();
        if(duration1 == 1.0){
            System.out.println("The price: $8.99" );
        }else if(duration1 == 1.5){
            System.out.println("The price: $10.50");
        }else if(duration1 == 2.0){
            System.out.println("The price: $12.99");
        }else if(duration1 == 2.5){
            System.out.println("The price: $14.50");
        }else if(duration1 >= 3){
            System.out.println("The price: $15.99");
        }

 //8
        int nuM = scan.nextInt();
        int num2 = scan.nextInt();

        //CODE HERE
        if(nuM>=num2){
            System.out.println(nuM + " and " + num2 + " are equal");
            System.out.println(nuM + " is greater than " + num2);
            System.out.println(num2 + " is greater than " + nuM);
        }else{
            System.out.println(nuM + " and " + num2 +  " are not equal");
            System.out.println(nuM + " is smaller than " + num2);
            System.out.println(num2 + " is smaller than " + nuM);
        }
 //9
        //     - Declare two variables: length and width
        //         - Calculate the Perimeter 2(l*w)
        //         - Calculate the Area (w * l)
        //     - Print properties of the Rectangle
        //     - Modify to accept Scanner inputs
        System.out.println("Enter length and width:");
        int length = scan.nextInt();
        int width = scan.nextInt();
        System.out.println("length: " + length);
        System.out.println("width: " + width);
        int perimeter = 2*(length * width);
        System.out.println("Perimeter: " + perimeter);
        int area = width * length;
        System.out.println("Area: " + area);
//10
        System.out.println("Enter the season by number from 1 to 4:");
        int season = scan.nextInt();
        int day = 0;
        int night = 0;
        String seasonName = " ";
        if(season == 1){
            day = 14;
            night = 10;
            seasonName = "spring ";
            System.out.println(seasonName + " day: " + day + " night: " + night);
        }else if(season == 2){
            day = 16;
            night = 8;
            seasonName = "summer ";
            System.out.println(seasonName + " day: " + day + " night: " + night);
        }else if(season == 3){
            day = 14;
            night = 10;
            seasonName = "fall ";
            System.out.println(seasonName + " day: " + day + " night: " + night);
        }else if(season == 4){
            day = 12;
            night = 12;
            seasonName = "winter ";
            System.out.println(seasonName + " day: " + day + " night: " + night);
        }
        System.out.println("In " + seasonName + " there is " + day + " hours of daylight and " + night + "  hours of nighttime");
 //11
        //3695
        // 3600 sec in 1 hour
        System.out.println("Seconds: ");
        int inputSec = scan.nextInt();
        int hours = inputSec / 3600; // 3695/3600=1
        //inputSec = inputSec % 3600;
        inputSec %= 3600; // 3695-3600=95
        int min = inputSec / 60; // 95/60=1
        inputSec %= 60; //35
        int sec = inputSec;
        System.out.println(hours + " hours, " + min + " minutes, " + sec + " seconds");

//12
        System.out.println("Enter numbers: ");
        int num1 = scan.nextInt();
        int nuM2 = scan.nextInt();
        System.out.println("if the nums are " + num1 + " and " + nuM2);
        int plus = num1 + nuM2;
        System.out.println(num1 + " + " + nuM2 + " = " + plus);
        int minus = num1 - nuM2;
        System.out.println(num1 + " - " + nuM2 + " = " + minus);
        int multi = num1 * nuM2;
        System.out.println(num1 + " * " + nuM2 + " = " + multi);
        int divide = num1 / nuM2;
        System.out.println(num1 + " / " + nuM2 + " = " + divide);
        int rem = num1 % nuM2;
        System.out.println(num1 + " % " + nuM2 + " = " + rem);
        //    - Declare two double variables
        //    - Declare 5 more double variables for each operation.
        //        > Execute all the operation between the first two numbers
        //    - Print out operations
        //        Ex: if the nums are 5 and 10
        //            5 + 10 = 15
        //            5 - 10 = -5



    }
}

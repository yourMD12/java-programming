package day45_oop;

public class TrafficLightObjects {
    public static void main(String[] args){
        //create traffic light object
        TrafficLight trafficLight = new TrafficLight();
        //trafficLight.color = "red";   NOT THIS WAY TODAY
        //we will assign/update the value of color using a method of the class
        trafficLight.changeColor("red");
        //sout(trafficLight.color); DIRECT ACCES TO VARIABLES
        //call method to access the variables
        trafficLight.showColor(); //current color = red

        trafficLight.changeColor("green"); //changing color to: green
        trafficLight.showColor(); //current color = red

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.color = "black";
        trafficLight2.showColor();// current color = black BUT ITS NOT VALID FOR TRAFFIC COLOR
        //that's why we call through our method, it can control valid variables
        trafficLight2.changeColor("brown"); //ERROR: invalid color: brown


    }
}

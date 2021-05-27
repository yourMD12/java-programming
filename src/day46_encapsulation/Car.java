package day46_encapsulation;

public class Car {
// model, year,mileage,
    //encapsulated/hidden instance variables
    private String model;
    private int year;
    private int mileage;

    //setter method for model
    public void setModel(String carModel) {
        model = carModel;
    }

    //getter method
    public String getModel(){
        return model;
    }

    //setter for year
    public void setYear(int year){
        this.year = year;// without this. sout(car1.getYear()); will show us 0
    }
    //getter for year
    public int getYear(){
        return year;
    }

    public void setMileage(int mileage){
        this.mileage = mileage;
    }
    public int getMileage(){
        return mileage;
    }

    public String toString(){
        return "Car + model = " + model;
    }


}

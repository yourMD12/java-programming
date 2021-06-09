package day51_inheritance.super_keyword;

public class LyftXL extends Lyft {

    @Override
    public double calcRate(double miles){
        return super.calcRate(miles) *1.1;
    }


}

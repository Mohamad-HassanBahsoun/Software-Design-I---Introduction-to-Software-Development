package DesignPatterns.Strategy;

public class Animal {
    public Flys flyingType;


    public String tryToFly(){
        return flyingType.fly();
    }

    public void setFlight(Flys newFlyType){
        flyingType = newFlyType;
    }

}

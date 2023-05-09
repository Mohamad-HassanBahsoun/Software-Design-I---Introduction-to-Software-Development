package DesignPatterns.Strategy;

public class Bird extends Animal{

    public Bird(){
        super();

        flyingType = new itFlys();
    }
}

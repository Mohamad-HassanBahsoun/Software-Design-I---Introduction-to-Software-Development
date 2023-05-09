package DesignPatterns.Decorator;

public class PlainPizza implements Pizza {

    public String getDescription() {
        return "Thin Dough";
    }

    public double getCost() {
        return 5.00;
    }
}

package DesignPatterns.Decorator;

public class Olives extends ToppingDecorator{
    public Olives(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding olives");
    }

    public String getDescription(){
        return tempPizza.getDescription() + ", Olives";
    }

    public double getCost() {
        return tempPizza.getCost() + 2.00;
    }
}

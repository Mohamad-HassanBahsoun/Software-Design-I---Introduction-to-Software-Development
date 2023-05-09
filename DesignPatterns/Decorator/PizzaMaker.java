package DesignPatterns.Decorator;

public class PizzaMaker {

    public static void main(String[] args) {

        Pizza basicPizza = new Olives(new Mozzarella(new TomatoSauce(new PlainPizza())));

        System.out.println("Ingredients: "+ basicPizza.getDescription());
        System.out.println(basicPizza.getCost());


    }
}

package DesignPatterns.Strategy;

public class AnimalTest {

    public static void main(String[] args) {

        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println(sparky.tryToFly());
        System.out.println(tweety.tryToFly());

        sparky.setFlight(new itFlys());
        System.out.println(sparky.tryToFly());

    }
}

package DesignPatterns.Adapter;
import java.util.Random;

public class EnemyRobo {
    // this is the adpatee
    // adpater will send method calls to objects that use the enemy attacker interface
    // to the right methods that are going to be defined here

    Random gen = new Random();

    public void smashWithHands(){
        int damage = gen.nextInt(10)+1;
        System.out.println("robo does "+ damage+ " damage with hands");

    }

    public void walkForward(){
        int move = gen.nextInt(5)+1;
        System.out.println(" Robo walks forward " + move+ " spaces");
    }

    public void reactToHuman(String driverName){
        System.out.println("Robo tramps on "+ driverName);
    }

}

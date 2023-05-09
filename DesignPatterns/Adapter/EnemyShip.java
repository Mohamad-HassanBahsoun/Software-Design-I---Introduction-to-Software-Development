package DesignPatterns.Adapter;

public class EnemyShip {

    public void fireLaser(){
        int damage = 10;
        System.out.println("robo does "+ damage+ " damage with lasers");

    }

    public void flyForward(){
        int move = 40;
        System.out.println(" Robo walks forward " + move+ " spaces");
    }

    public void reactToHuman(String driverName){
        System.out.println("ship zooms past on "+ driverName);
    }


}

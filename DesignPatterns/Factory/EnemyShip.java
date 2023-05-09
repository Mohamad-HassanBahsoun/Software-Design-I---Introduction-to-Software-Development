package DesignPatterns.Factory;

abstract class EnemyShip {
    private String name;
    private double damage;


    public void followHeroShip(){
        System.out.println(getName() + " is following the hero Ship");
    }

    public void displayEnemyShip(){
        System.out.println(getName() +" is on the screen");
    }

    public void enemyShipShoots(){
        System.out.println(getName()+ " shoots hero and does "+ getDamage()+ " damage");
    }

    public void setName(String newName){
        name = newName;
    }

    public String getName(){
        return name;
    }

    public void setDamage(double newDamage){
        damage = newDamage;
    }

    public double getDamage(){
        return damage;
    }




}

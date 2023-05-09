package DesignPatterns.Factory;
import java.util.Scanner;

public class EnemyShipTest {

    public static void main(String[] args) {

        EnemyShipFactory makeShip = new EnemyShipFactory();

        EnemyShip theEnemy = null;

        Scanner scan = new Scanner(System.in);

        String type = scan.nextLine();

        theEnemy = makeShip.makeEnemyShip(type);

        doStuff(theEnemy);
    }

    public static void doStuff(EnemyShip enemy){
        enemy.displayEnemyShip();
        enemy.followHeroShip();
        enemy.enemyShipShoots();
    }
}

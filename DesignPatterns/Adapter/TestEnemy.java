package DesignPatterns.Adapter;

public class TestEnemy {

    public static void main(String[] args) {

//        EnemyTank rx7 = new EnemyTank();
//
//        EnemyRobo robo = new EnemyRobo();
//
//        EnemyAttacker roboAdapter = new EnemyRobotAdapter(robo);
//
//        robo.reactToHuman("Paul");
//        robo.walkForward();
//        robo.smashWithHands();
//        System.out.println("==============================");
//        rx7.assignDriver("Paul");
//        rx7.driveForward();
//        rx7.fireWeapon();
//        System.out.println("===========================");
//        roboAdapter.assignDriver("Paul");
//        roboAdapter.driveForward();
//        roboAdapter.fireWeapon();

        EnemyShip theShip = new EnemyShip();

        EnemyShipAdapter theShipAdapt = new EnemyShipAdapter(theShip);

        theShipAdapt.fireWeapon();


    }
}

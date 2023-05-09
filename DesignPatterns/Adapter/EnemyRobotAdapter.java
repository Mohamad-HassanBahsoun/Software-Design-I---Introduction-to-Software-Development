package DesignPatterns.Adapter;

public class EnemyRobotAdapter implements EnemyAttacker {

    EnemyRobo theRobo;

    public EnemyRobotAdapter(EnemyRobo newRobo){
        theRobo = newRobo;
    }

    @Override
    public void fireWeapon() {

        theRobo.smashWithHands();

    }

    @Override
    public void driveForward() {
        theRobo.walkForward();
    }

    @Override
    public void assignDriver(String driverName) {
        theRobo.reactToHuman(driverName);
    }
}

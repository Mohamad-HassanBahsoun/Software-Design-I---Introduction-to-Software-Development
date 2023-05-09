package DesignPatterns.Adapter;

public class EnemyShipAdapter implements EnemyAttacker{

   EnemyShip theShip;

   public EnemyShipAdapter(EnemyShip newShip){
       theShip=newShip;
   }

    @Override
    public void fireWeapon() {
       theShip.fireLaser();
    }

    @Override
    public void driveForward() {
       theShip.flyForward();
    }

    @Override
    public void assignDriver(String driverName) {
       theShip.reactToHuman(driverName);
    }
}

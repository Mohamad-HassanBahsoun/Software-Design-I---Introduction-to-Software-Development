package DesignPatterns.Adapter;

public interface EnemyAttacker {
    // what the client expects to be working with

    public void fireWeapon();
    public void driveForward();
    public  void assignDriver(String driverName);


}

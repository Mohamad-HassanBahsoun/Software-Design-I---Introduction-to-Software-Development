package DesignPatterns.Command;

public class Television implements ElectronicDevice{

    private int vol = 0;


    @Override
    public void on() {
        System.out.println("TV is on");
    }

    @Override
    public void off() {
        System.out.println("TV is off");
    }

    @Override
    public void turnUp() {
        vol++;
        System.out.println("Volume is at " + vol);
    }

    @Override
    public void turnDown() {
        vol--;
        System.out.println("Volume is at " + vol);
    }
}

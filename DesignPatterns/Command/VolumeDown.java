package DesignPatterns.Command;

public class VolumeDown implements Command{
    ElectronicDevice device ;
    public VolumeDown(ElectronicDevice newDevice){
        device = newDevice;
    }

    @Override
    public void execute() {
        device.turnDown();
    }

}

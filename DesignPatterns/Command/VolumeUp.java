package DesignPatterns.Command;

public class VolumeUp implements Command{
    ElectronicDevice device ;
    public VolumeUp(ElectronicDevice newDevice){
        device = newDevice;
    }

    @Override
    public void execute() {
        device.turnUp();
    }

}

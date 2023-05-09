package DesignPatterns.Command;

public class TurnTVOff implements Command{


    ElectronicDevice device ;

    public TurnTVOff(ElectronicDevice newDevice){
        device = newDevice;
    }

    @Override
    public void execute() {
        device.off();
    }

}


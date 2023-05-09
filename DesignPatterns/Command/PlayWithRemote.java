package DesignPatterns.Command;

public class PlayWithRemote {

    public static void main(String[] args) {

        ElectronicDevice newDevice = TVRemote.getDevice();


        TurnTVOn onCommand = new TurnTVOn(newDevice);
        DeviceButton onPressed = new DeviceButton(onCommand);
        onPressed.press();

        //-----------------------------------
        TurnTVOff offCommand = new TurnTVOff(newDevice);
        onPressed = new DeviceButton(offCommand);
        onPressed.press();

        //------------------------------------------
        VolumeUp volCommand = new VolumeUp(newDevice);
        onPressed = new DeviceButton(volCommand);
        onPressed.press();

    }
}

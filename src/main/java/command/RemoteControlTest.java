package command;

import command.ceilingfan.CeilingFan;
import command.ceilingfan.CeilingFanOffCommand;
import command.ceilingfan.CeilingFanOnCommand;
import command.garage.GarageDoor;
import command.garage.GarageDoorDownCommand;
import command.garage.GarageDoorUpCommand;
import command.kitchen.KitchenLightOffCommand;
import command.kitchen.KitchenLightOnCommand;
import command.livingroom.LivingRoomLightOffCommand;
import command.livingroom.LivingRoomLightOnCommand;
import command.stereo.Stereo;
import command.stereo.StereoOffCommand;
import command.stereo.StereoOnCommand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light kitchenLight = new Light("Kitchen");
        Light livingRoomLight = new Light("Living Room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo("Living Room");
        CeilingFan ceilingFan = new CeilingFan("Living room");

        KitchenLightOnCommand kitchenLightOn = new KitchenLightOnCommand(kitchenLight);
        KitchenLightOffCommand kitchenLightOff = new KitchenLightOffCommand(kitchenLight);
        LivingRoomLightOnCommand livingRoomLightOn = new LivingRoomLightOnCommand(livingRoomLight);
        LivingRoomLightOffCommand livingRoomLightOff = new LivingRoomLightOffCommand(livingRoomLight);
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        MacroCommand partyOn = new MacroCommand(Arrays.asList(kitchenLightOn, livingRoomLightOn, stereoOn,ceilingFanOn));
        MacroCommand partyOff = new MacroCommand(Arrays.asList(kitchenLightOff, livingRoomLightOff, stereoOn,ceilingFanOff));

        remote.setCommand(0, kitchenLightOn, kitchenLightOff);
        remote.setCommand(1, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(2, ceilingFanOn, ceilingFanOff);
        remote.setCommand(3, stereoOn, stereoOff);
        remote.setCommand(4, garageDoorUp, garageDoorDown);
        remote.setCommand(5,partyOn, partyOff);

        System.out.println(remote);

        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        remote.undoButtonWasPushed();
        remote.onButtonWasPushed(1);
        remote.offButtonWasPushed(1);
        remote.onButtonWasPushed(2);
        remote.undoButtonWasPushed();
        remote.offButtonWasPushed(2);
        remote.onButtonWasPushed(3);
        remote.offButtonWasPushed(3);
        remote.undoButtonWasPushed();
        remote.onButtonWasPushed(4);
        remote.offButtonWasPushed(4);
    }
}

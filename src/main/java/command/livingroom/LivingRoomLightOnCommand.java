package command.livingroom;

import command.Command;
import command.Light;

public class LivingRoomLightOnCommand implements Command {
    Light light;

    public LivingRoomLightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}

package command.livingroom;

import command.Command;
import command.Light;

public class LivingRoomLightOffCommand implements Command {
    Light light;

    public LivingRoomLightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}

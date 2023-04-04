package command.kitchen;

import command.Command;
import command.Light;

public class KitchenLightOnCommand implements Command {
    Light light;

    public KitchenLightOnCommand(Light light) {
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
